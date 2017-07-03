package com.zeus.iterator;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public interface Iterator<T>
{
    boolean hashNext();

    T next();
}
