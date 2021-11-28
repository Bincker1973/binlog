package cn.bincker.web.blog.base.entity;

import cn.bincker.web.blog.base.config.UserAuditingListener;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@EntityListeners(UserAuditingListener.class)
@Getter
@Setter
@ToString
public class AuditEntity extends BaseEntity{
    @CreatedBy
    @ManyToOne
    @NotNull
    private BaseUser createdUser;

    @LastModifiedBy
    @ManyToOne
    @NotNull
    private BaseUser lastModifiedUser;
}
