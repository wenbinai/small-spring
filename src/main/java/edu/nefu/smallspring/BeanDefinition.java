package edu.nefu.smallspring;

public class BeanDefinition {
    private Object clazz;

    public BeanDefinition(Object clazz) {
        this.clazz = clazz;
    }

    public Object getClazz() {
        return clazz;
    }

    public void setClazz(Object clazz) {
        this.clazz = clazz;
    }
}
