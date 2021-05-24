package com.creater.factoryMethod;

/**
 * @Classname : ConcreteFactory
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class LatteCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
