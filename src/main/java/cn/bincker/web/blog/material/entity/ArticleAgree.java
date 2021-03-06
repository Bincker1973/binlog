package cn.bincker.web.blog.material.entity;

import cn.bincker.web.blog.base.config.UserAuditingListener;
import cn.bincker.web.blog.base.entity.BaseEntity;
import cn.bincker.web.blog.base.entity.BaseUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@EntityListeners(UserAuditingListener.class)
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class ArticleAgree extends BaseEntity {
    @ManyToOne
    @NotNull
    @CreatedBy
    private BaseUser createdUser;

    @ManyToOne
    @NotNull
    private Article article;
}
