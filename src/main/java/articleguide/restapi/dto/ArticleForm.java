package articleguide.restapi.dto;

import articleguide.restapi.entity.Article;

public class ArticleForm {
    private String category;
    private String title;
    private String content;
    private String keyword;
    private String summary;
    private String byline;

    public Article toEntity(){
        return Article.builder()
                .category(this.category)
                .title(this.title)
                .content(this.content)
                .keyword(this.keyword)
                .summary(this.summary)
                .byline(this.byline)
                .build();
    }
}
