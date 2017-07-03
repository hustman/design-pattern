package com.zeus.nullobject;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class NodeImpl implements Node {

    private String name;
    private Node left;
    private Node right;

    public NodeImpl(String name, Node left, Node right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTreeSize() {
        return 1 + left.getTreeSize() + right.getTreeSize();
    }

    @Override
    public Node getLeft() {
        return left;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public void walk() {
        System.out.println(name);
        if(left != NullNode.getInstance()){
            left.walk();
        }
        if(right != NullNode.getInstance()){
            right.walk();
        }
    }
}
