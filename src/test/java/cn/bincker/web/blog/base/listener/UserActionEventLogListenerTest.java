package cn.bincker.web.blog.base.listener;

import cn.bincker.web.blog.base.entity.BaseUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class UserActionEventLogListenerTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void test() {
        var user = new BaseUser();
        user.setId(1L);
    }
}
