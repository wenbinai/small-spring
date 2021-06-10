package edu.nefu.smallspring.factory.support;

import edu.nefu.smallspring.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (Exception e) {
            // todo 优化异常处理
            e.printStackTrace();
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
