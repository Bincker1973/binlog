package cn.bincker.web.blog.expression.entity;

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

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@EntityListeners(UserAuditingListener.class)
public class ExpressionAgree extends BaseEntity {
    @ManyToOne
    private Expression expression;

    @CreatedBy
    @ManyToOne
    @NotNull
    private BaseUser createdUser;
}
