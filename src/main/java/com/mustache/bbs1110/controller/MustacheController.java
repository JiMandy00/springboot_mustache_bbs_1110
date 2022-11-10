package com.mustache.bbs1110.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

    @GetMapping("/hi/{id}")
    public String hiController(@PathVariable String id, Model model) {
        model.addAttribute("username", "rock star");
        model.addAttribute("id", id);
        return "greetings";
    }
}
