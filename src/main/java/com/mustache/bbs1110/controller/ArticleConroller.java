package com.mustache.bbs1110.controller;

import com.mustache.bbs1110.domain.dto.ArticleDto;
import com.mustache.bbs1110.domain.entity.Article;
import com.mustache.bbs1110.domain.repository.AricleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j // log
public class ArticleConroller {

    private final AricleRepository aricleRepository;

    public ArticleConroller(AricleRepository aricleRepository) {
        this.aricleRepository = aricleRepository;
    }

    @GetMapping("/new")
    public String CreateArticleConroller() {
        return "new";
    }

    @PostMapping("/posts")
    public String CreateArticle(ArticleDto form) {
        log.info(form.toString());
        Article article = form.toEntity();
        aricleRepository.save(article);
        return "";
    }


}
