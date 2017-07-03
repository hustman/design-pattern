package com.zeus.command;

/**
 * @author xuxingbo
 * @Date 2017/6/30
 */
public class SellCommand implements Command {
    private Product product;

    public SellCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        //加价10%卖掉
        double sellPrice = product.getPrice() * 1.1;
        System.out.println(String.format("Sell product %s , price = %f", product.getName(), sellPrice));
    }
}
