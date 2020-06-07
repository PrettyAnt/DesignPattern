package com.prettyant.factorypattern.store;

import com.prettyant.factorypattern.categry.CheesePizza;
import com.prettyant.factorypattern.categry.ClamPizza;
import com.prettyant.factorypattern.categry.GreekPizza;
import com.prettyant.factorypattern.categry.PepperoniPizza;
import com.prettyant.factorypattern.categry.Pizza;
import com.prettyant.factorypattern.categry.VeggiePizza;
import com.prettyant.factorypattern.factory.SimplePizzaFactory;

/**
 * @author ChenYu
 * Author's github https://github.com/PrettyAnt
 * <p>
 * Created on 2:21 PM  2020/6/7
 * PackageName : com.example.prettyant.store
 * describle :
 */
public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
