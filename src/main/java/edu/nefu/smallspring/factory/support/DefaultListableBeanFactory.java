package edu.nefu.smallspring.factory.support;

import edu.nefu.smallspring.exception.BeanException;
import edu.nefu.smallspring.factory.config.BeanDefinition;

import java.util.concurrent.ConcurrentHashMap;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap;

    public DefaultListableBeanFactory() {
        beanDefinitionMap = new ConcurrentHashMap<>();
    }


    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeanException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }


    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
