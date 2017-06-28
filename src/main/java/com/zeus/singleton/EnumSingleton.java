package com.zeus.singleton;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 * 使用枚举类型来实现单例，《Effective Java》作者Josh Bloch 提倡的方式
 */
public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return "EnumSingleton{} " + super.toString();
    }
}
