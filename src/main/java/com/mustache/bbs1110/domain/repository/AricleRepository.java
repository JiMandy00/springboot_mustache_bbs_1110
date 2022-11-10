package com.mustache.bbs1110.domain.repository;

import com.mustache.bbs1110.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AricleRepository extends JpaRepository<Article, Long> {
}
