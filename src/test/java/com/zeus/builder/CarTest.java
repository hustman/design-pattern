package com.zeus.builder;

import org.junit.Test;
import com.zeus.builder.Car.Builder;


/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class CarTest {

    @Test
    public void testBuilder(){
        Builder builder = new Builder(Brand.BAOMA,CarColor.BLACK);
        Car car = builder.setEngine(Engine.V6).setPower(Power.GAS).setMaxSpeed(300).build();
        System.out.println(car);
    }

}