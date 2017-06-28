package com.zeus.builder;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public enum Power {
    ELECTROC("纯电动"), GAS("汽油车"), Hybrid("混合动力");

    private Power(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Power is " + value;
    }
}
