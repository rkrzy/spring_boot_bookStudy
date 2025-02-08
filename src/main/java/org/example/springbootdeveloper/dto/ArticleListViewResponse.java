package org.example.springbootdeveloper.dto;

import lombok.Getter;
import org.example.springbootdeveloper.domain.Article;

@Getter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Long id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public ArticleListViewResponse(Article article){
        this.id = article.getId();
        this.content = article.getContent();
        this.title = article.getTitle();
    }
}
