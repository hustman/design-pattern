package com.zeus.builder;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public enum CarColor {
    RED("红色"), WHITE("白色"), BLACK("黑色"),BLUE("蓝色");

    private CarColor(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "color is " + value;
    }
}
