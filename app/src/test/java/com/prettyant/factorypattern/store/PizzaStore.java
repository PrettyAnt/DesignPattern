package com.prettyant.factorypattern.store;

import com.prettyant.factorypattern.categry.Pizza;
import com.prettyant.factorypattern.factory.SimplePizzaFactory;

/**
 * @author ChenYu
 * Author's github https://github.com/PrettyAnt
 * <p>
 * Created on 1:52 PM  2020/6/7
 * PackageName : com.example.prettyant.model
 * describle :
 */
public abstract class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
//        Pizza pizza = factory.createPizza(type);
        Pizza pizza = createPizza(type);
        pizza.prepare(type);
        pizza.bake(type);
        pizza.cut(type);
        pizza.box(type);
        return pizza;
    }
    abstract Pizza createPizza(String type);
}
