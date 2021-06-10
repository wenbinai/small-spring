package edu.nefu.smallspring;

import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap;

    public BeanFactory() {
        beanDefinitionMap = new ConcurrentHashMap<>();
    }

    public Object getBean(String name) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        return beanDefinition.getClazz();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
