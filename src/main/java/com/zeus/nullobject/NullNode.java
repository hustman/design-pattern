package com.zeus.nullobject;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class NullNode implements Node {
    private static NullNode instance = new NullNode();
    private NullNode(){}

    public static NullNode getInstance(){
        return instance;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getTreeSize() {
        return 0;
    }

    @Override
    public Node getLeft() {
        return null;
    }

    @Override
    public Node getRight() {
        return null;
    }

    @Override
    public void walk() {
        //do nothing
    }
}
