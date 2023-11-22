package com.wally.playground.simple_java.parse_html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class ParseHtmlTest {
    public static void main(String[] args) {
        String html = """
                    <p>Parsed HTML into a doc.</p>
                    <h1>hello</h1>
                    <img src="https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png" alt="google logo">
                    <img src="https://www.java.com/content/published/api/v1.1/assets/CONTAC42441D88644D75A6C7B964A1FA1601/native?cb=_cache_7dbc&channelToken=1f7d2611846d4457b213dfc9048724dc" alt="google logo">
                    """;

        // 이렇게 읽어야 문자열 그대로 파싱하고, Jsoup.parse(html)하면 앞뒤에 <html><head></head> 등이 붙음
        Document document = Jsoup.parse(html, "", Parser.xmlParser());
        Elements imgTags = document.getElementsByTag("img");

        imgTags.forEach(imgTag -> System.out.println(imgTag.attr("src")));
    }
}
