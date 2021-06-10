//package edu.nefu.smallspring.verson01;
//
//import edu.nefu.smallspring.factory.config.BeanDefinition;
//import edu.nefu.smallspring.factory.BeanFactory;
//import edu.nefu.smallspring.bean.UserService;
//import org.junit.Test;
//
//public class ApiTest {
//    @Test
//    public void test_BeanFactory() {
//        // 1.初始化 BeanFactory
//        BeanFactory beanFactory = new BeanFactory();
//
//        // 2.注入bean
//        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
//        beanFactory.registerBeanDefinition("userService", beanDefinition);
//
//        // 3.获取bean
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfo();
//    }
//}
