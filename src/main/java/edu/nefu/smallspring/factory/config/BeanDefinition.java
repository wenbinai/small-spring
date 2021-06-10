package edu.nefu.smallspring.factory.config;

public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class clazz) {
        this.beanClass = clazz;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setClazz(Class clazz) {
        this.beanClass = clazz;
    }
}
