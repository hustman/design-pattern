package com.zeus.builder;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class Car {
    /**
     * 品牌
     */
    private Brand brand;
    /**
     * 颜色
     */
    private CarColor color;
    /**
     * 引擎型号
     */
    private Engine engine;

    /**
     * 动力类型
     */
    private Power power;
    /**
     * 最高时速
     */
    private Integer maxSpeed;

    private Car(Builder builder){
        this.brand = builder.brand;
        this.color = builder.color;
        this.engine = builder.engine;
        this.power = builder.power;
        this.maxSpeed = builder.maxSpeed;
    }

    public Brand getBrand() {
        return brand;
    }

    public CarColor getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Power getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("this car").append(brand.toString()).append(",").append(color.toString());
        if(engine != null){
            sb.append(",").append("engine is ").append(engine.toString());
        }
        if(power != null){
            sb.append(",").append(power.toString());
        }
        if(maxSpeed != null){
            sb.append(",").append("maxSpeed is ").append(maxSpeed);
        }
        return sb.toString();
    }

    public static class Builder{
        private Brand brand;
        private CarColor color;
        private Engine engine;
        private Power power;
        private Integer maxSpeed;

        public Builder(Brand brand, CarColor color) {
            if(brand == null || color == null){
                throw new IllegalArgumentException("品牌和颜色不能为空");
            }
            this.brand = brand;
            this.color = color;
        }

        public Builder setEngine(Engine engine){
            this.engine = engine;
            return this;
        }

        public Builder setPower(Power power) {
            this.power = power;
            return this;
        }

        public Builder setMaxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
