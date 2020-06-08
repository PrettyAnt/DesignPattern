package com.prettyant.factorypattern.store;

import com.prettyant.factorypattern.style.NYStyleClamPizza;
import com.prettyant.factorypattern.style.NYStyleGreekPizza;
import com.prettyant.factorypattern.style.NYStyleCheesePizza;
import com.prettyant.factorypattern.style.NYStylePepperoniPizza;
import com.prettyant.factorypattern.style.Pizza;
import com.prettyant.factorypattern.style.NYStyleVeggiePizza;
import com.prettyant.factorypattern.factory.SimplePizzaFactory;

/**
 * @author ChenYu
 * Author's github https://github.com/PrettyAnt
 * <p>
 * Created on 2:21 PM  2020/6/7
 * PackageName : com.example.prettyant.store
 * describle :
 */
public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore() {
    }

    @Override
   protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new NYStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }

}
