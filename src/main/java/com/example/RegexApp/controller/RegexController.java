package com.example.RegexApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Pattern;

@Controller
public class RegexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/process")
    public String process(@RequestParam String input, @RequestParam String pattern, Model model) {
        boolean matches = Pattern.matches(pattern, input);
        model.addAttribute("input", input);
        model.addAttribute("pattern", pattern);
        model.addAttribute("matches", matches);
        return "result";
    }
}

