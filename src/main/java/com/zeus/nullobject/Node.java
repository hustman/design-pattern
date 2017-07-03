package com.zeus.nullobject;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public interface Node {
    String getName();

    int getTreeSize();

    Node getLeft();

    Node getRight();

    void walk();
}
