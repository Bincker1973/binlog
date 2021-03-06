package cn.bincker.web.blog.base.service;

import cn.bincker.web.blog.base.dto.BaseUserDto;
import cn.bincker.web.blog.base.entity.BaseUser;
import cn.bincker.web.blog.base.event.UserActionEvent;
import cn.bincker.web.blog.base.vo.BaseUserVo;
import cn.bincker.web.blog.base.vo.UserDetailVo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface IBaseUserService extends UserDetailsService {
    BaseUser getByUsername(String username);

    Optional<BaseUser> findByQQOpenId(String openId);

    Optional<BaseUser> findByUsername(String userName);

    void changePassword(BaseUser user, String password);

    UserDetailVo getUserDetail(BaseUser user);

    void changeHeadImg(BaseUser user, String headImgUrl);

    List<BaseUserVo> findAll();

    List<BaseUserVo> findAllById(List<Long> ids);

    List<UserDetailVo> getBloggers();

    void register(BaseUserDto dto);

    Optional<BaseUser> findByGithub(String github);

    void login(BaseUser user, UserActionEvent.ActionEnum type, String additionalInfo);

    void bindGithub(BaseUser user, String github);

    void bindQqOpenId(BaseUser user, String qqOpenId);
}
