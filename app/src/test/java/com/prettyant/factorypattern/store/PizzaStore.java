package com.prettyant.factorypattern.store;

import com.prettyant.factorypattern.style.Pizza;
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

    public PizzaStore() {
    }

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare(type);
        pizza.bake(type);
        pizza.cut(type);
        pizza.box(type);
        return pizza;
    }
   protected abstract Pizza createPizza(String type);
}
