package edu.nefu.smallspring.version02;

import edu.nefu.smallspring.factory.config.BeanDefinition;
import edu.nefu.smallspring.bean.UserService;
import edu.nefu.smallspring.factory.support.DefaultListableBeanFactory;
import org.junit.Assert;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1. 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registryBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService singleUserService = (UserService) beanFactory.getBean("userService");
        Assert.assertEquals(userService, singleUserService);
    }
}
