package edu.nefu.smallspring.factory;

import edu.nefu.smallspring.exception.BeanException;

public interface BeanFactory {
    Object getBean(String name) throws BeanException;
}
