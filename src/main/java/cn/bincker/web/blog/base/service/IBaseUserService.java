package cn.bincker.web.blog.base.service;

import cn.bincker.web.blog.base.entity.BaseUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IBaseUserService extends UserDetailsService {
    BaseUser getByUsername(String username);

    Optional<BaseUser> findByQQOpenId(String openId);

    Optional<BaseUser> findByUsername(String userName);
}
