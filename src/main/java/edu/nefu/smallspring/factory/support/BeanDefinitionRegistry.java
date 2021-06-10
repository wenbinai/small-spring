package edu.nefu.smallspring.factory.support;

import edu.nefu.smallspring.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
