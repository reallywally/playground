package com.wally.playground.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/html")
    public String postProduct(Model model) {

        model.addAttribute("data", "ho!");

        return "popup";
    }
}
