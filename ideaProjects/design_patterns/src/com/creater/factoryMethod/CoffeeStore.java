package com.creater.factoryMethod;

/**
 * @Classname : AbstractProduct
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class CoffeeStore {

    private CoffeeFactory factory;
    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee(String type) {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
