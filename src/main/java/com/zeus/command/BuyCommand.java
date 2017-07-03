package com.zeus.command;

/**
 * @author xuxingbo
 * @Date 2017/6/30
 */
public class BuyCommand implements Command  {

    private Product product;

    public BuyCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        System.out.println(String.format("Buy product %s , price = %f", product.getName(), product.getPrice()));
    }
}
