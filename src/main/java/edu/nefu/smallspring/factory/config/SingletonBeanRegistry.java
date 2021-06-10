package edu.nefu.smallspring.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
