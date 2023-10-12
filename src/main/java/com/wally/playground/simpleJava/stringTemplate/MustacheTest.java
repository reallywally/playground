package com.wally.playground.simpleJava.stringTemplate;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MustacheTest {
    List<Item> items() {
        return Arrays.asList(
                new Item("Item 1", "$19.99", Arrays.asList(new Feature("New!"), new Feature("Awesome!"))),
                new Item("Item 2", "$29.99", Arrays.asList(new Feature("Old."), new Feature("Ugly.")))
        );
    }

    static class Item {
        Item(String name, String price, List<Feature> features) {
            this.name = name;
            this.price = price;
            this.features = features;
        }

        String name, price;
        List<Feature> features;
    }

    static class Feature {
        Feature(String description) {
            this.description = description;
        }

        String description;
    }

    public static void main(String[] args) {
        // 변수를 가진걸로 처리
        String text = """
                {{#items}}
                Name: {{name}}
                Price: {{price}}
                  {{#features}}
                  Feature: {{description}}
                  {{/features}}
                {{/items}}
                """;

//        MustacheFactory mf = new DefaultMustacheFactory();
//        Mustache mustache = mf.compile(new StringReader(text), "example");
//
//        try {
//            mustache.execute(new PrintWriter(System.out), new MustacheTest()).flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 맵 사용
        List<Item> items = List.of(
                new Item("Item 11", "$19.99", Arrays.asList(new Feature("New!"), new Feature("Awesome!"))),
                new Item("Item 22", "$29.99", Arrays.asList(new Feature("Old."), new Feature("Ugly.")))
        );

        var scopes = new HashMap<String, Object>();
        scopes.put("items", items);
//        scopes.put("name", "Mustache");
//        scopes.put("feature", new Feature("Perfect!"));

        Writer writer = new OutputStreamWriter(System.out);
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(new StringReader(text), "example");
        mustache.execute(writer, scopes);

        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
