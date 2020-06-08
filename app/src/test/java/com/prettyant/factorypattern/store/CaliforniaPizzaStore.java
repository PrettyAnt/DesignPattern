package com.prettyant.factorypattern.store;

import com.prettyant.factorypattern.style.CaliforniaStyleClamPizza;
import com.prettyant.factorypattern.style.CaliforniaStyleGreekPizza;
import com.prettyant.factorypattern.style.CaliforniaStylePepperoniPizza;
import com.prettyant.factorypattern.style.CaliforniaStyleCheesePizza;
import com.prettyant.factorypattern.style.CaliforniaStyleVeggiePizza;
import com.prettyant.factorypattern.style.Pizza;
import com.prettyant.factorypattern.factory.SimplePizzaFactory;

/**
 * @author ChenYu
 * Author's github https://github.com/PrettyAnt
 * <p>
 * Created on 2:21 PM  2020/6/7
 * PackageName : com.example.prettyant.store
 * describle :
 */
public class CaliforniaPizzaStore extends PizzaStore {
    public CaliforniaPizzaStore() {
    }

    @Override
   protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new CaliforniaStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }
        return pizza;
    }
}
