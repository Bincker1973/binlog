package cn.bincker.web.blog.material.vo;

import cn.bincker.web.blog.base.vo.BaseUserVo;
import cn.bincker.web.blog.material.entity.Article;
import cn.bincker.web.blog.netdisk.vo.NetDiskFileVo;
import lombok.Data;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Data
public class ArticleVo {
    private Long id;
    private String title;
    private Boolean recommend;
    private Boolean top;
    private Boolean isPublic;
    private String keywords;
    private String describe;
    private String content;
    private Collection<TagVo> tags;
    private NetDiskFileVo cover;
    private String[] images;
    private ArticleClassVo articleClass;
    private String className;
    private Boolean isOriginal;
    private Long viewingNum;
    private Long agreedNum;
    private Long commentNum;
    private Long forwardingNum;
    private BaseUserVo createdUser;
    private Date createdDate;
    private Date lastModifiedDate;
    private Boolean isAgreed;

    public ArticleVo(Article article) {
        id = article.getId();
        title = article.getTitle();
        recommend = article.getRecommend();
        top = article.getTop();
        isPublic = article.getIsPublic();
        keywords = article.getKeywords();
        describe = article.getDescribe();
        content = article.getContent();
        tags = article.getTags().stream().map(t->new TagVo(t, null)).collect(Collectors.toSet());
        if(article.getCover() != null) cover = new NetDiskFileVo(article.getCover());
        images = article.getImages();
        articleClass = new ArticleClassVo(article.getArticleClass(), null);
        isOriginal = article.getIsOriginal();
        viewingNum = article.getViewingNum();
        agreedNum = article.getAgreedNum();
        commentNum = article.getCommentNum();
        forwardingNum = article.getForwardingNum();
        createdUser = new BaseUserVo(article.getCreatedUser());
        createdDate = article.getCreatedDate();
        lastModifiedDate = article.getLastModifiedDate();
    }
}
