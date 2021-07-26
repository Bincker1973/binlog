package cn.bincker.web.blog.material.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ArticleCommentDto {
    @NotNull
    private Long articleId;
    @NotEmpty
    private String content;
}
