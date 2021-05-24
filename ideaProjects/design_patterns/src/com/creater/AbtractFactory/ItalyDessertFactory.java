package com.creater.AbtractFactory;

/**
 * @Classname : ItalyDessertFactory
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/21
 */
public class ItalyDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
    public Dessert createDessert() {
        return new Tiramisu();
    }
}