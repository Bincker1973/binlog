package cn.bincker.web.blog.material.entity;

import cn.bincker.web.blog.base.entity.AuditEntity;
import cn.bincker.web.blog.base.entity.Comment;
import cn.bincker.web.blog.base.entity.converter.StringArrayConverter;
import cn.bincker.web.blog.netdisk.entity.NetDiskFile;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NamedEntityGraphs({
        @NamedEntityGraph(name = "Article.default", attributeNodes = {
                @NamedAttributeNode("tags"),
                @NamedAttributeNode("cover"),
                @NamedAttributeNode("articleClass"),
                @NamedAttributeNode("createdUser"),
        })
})
public class Article extends AuditEntity {
    @NotEmpty
    private String title;

    /**
     * 是否推荐
     */
    private Boolean recommend;

    /**
     * 置顶
     */
    private Boolean top;

    /**
     * 是否公开
     */
    private Boolean isPublic;

    /**
     * 推荐和置顶的排序
     */
    private Integer orderNum = 0;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 简述
     */
    @SuppressWarnings("JpaDataSourceORMInspection")
    @Column(name = "[describe]")
    private String describe;

    @ManyToMany
    @ToString.Exclude
    private Set<Tag> tags;

    @ManyToOne
    private NetDiskFile cover;

    @Convert(converter = StringArrayConverter.class)
    private String[] images;

    @NotNull
    @ManyToOne
    private ArticleClass articleClass;

    @NotEmpty
    @Column(columnDefinition = "text")
    private String content;

    /**
     * 是否原创
     */
    private Boolean isOriginal;

    /**
     * 浏览量
     */
    private Long viewingNum = 0L;

    /**
     * 赞数量
     */
    private Long agreedNum = 0L;

    /**
     * 评论量
     */
    private Long commentNum = 0L;

    /**
     * 转发量
     */
    private Long forwardingNum = 0L;

    @ManyToMany
    @ToString.Exclude
    private List<Comment> comments;
}
