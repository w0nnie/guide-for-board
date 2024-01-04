package com.guide.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/articles")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(Model model) {
        String article = "";
        model.addAttribute("article", article);
        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable Long articleId, Model model) {
        String article = "";
        String articleComments = "";
        model.addAttribute("article", article);
        model.addAttribute("articleComments", articleComments);
        return "articles/detail";
    }
}
