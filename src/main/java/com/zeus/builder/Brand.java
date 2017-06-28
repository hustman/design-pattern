package com.zeus.builder;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 * 车的品牌
 */
public enum  Brand {
    BENCHI("奔驰"),BAOMA("宝马"),AODI("奥迪"),DAZHONG("大众");

    private Brand(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    @Override
    public String toString(){
        return "Brand is " + value;
    }
}
