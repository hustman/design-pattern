package com.zeus.nullobject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class NodeTest {

    @Test
    public void testNullObject(){

        Node leaf1 = new NodeImpl("111",NullNode.getInstance(), NullNode.getInstance());
        Node leaf2 = new NodeImpl("112",NullNode.getInstance(), NullNode.getInstance());
        Node leaf3 = new NodeImpl("121",NullNode.getInstance(), NullNode.getInstance());
        Node leaf4 = new NodeImpl("122",NullNode.getInstance(), NullNode.getInstance());

        Node left = new NodeImpl("11", leaf1, leaf2);
        Node right = new NodeImpl("12", leaf3, leaf4);

        Node root = new NodeImpl("1", left, right);

        root.walk();

    }

}