package com.wally.playground.simple_java.string_template;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;

public class MustacheTest {
    static class Item {
        Item(String name, String price) {
            this.name = name;
            this.price = price;
        }

        String name, price;
    }

    public static void main(String[] args) {

        String text = """
                <html>
                    <head>
                        <title>메일 제목</title>
                    </head>
                    <body>
                        {{mallName}}
                        
                        {{#items}}
                        <div>
                            <h2>{{name}}</h2>
                            <h2>{{price}}</h2>
                            <h2>{{name}}</h2>
                        </div>
                        {{/items}}
                    </body>
                </html>
                """;

        MustacheFactory mustacheFactory = new DefaultMustacheFactory();
        List<Item> items = List.of(
                new Item("Item 11", "$19.99"),
                new Item("Item 22", "$29.99")
        );

        HashMap<String, Object> data = new HashMap<>();
        data.put("mallName", "김쇼핑몰");
        data.put("items", items);

        StringWriter stringWriter = new StringWriter();
        Mustache textMustache = mustacheFactory.compile(new StringReader(text), "textMustache");
        textMustache.execute(stringWriter, data);

        System.out.println(stringWriter);
    }
}
