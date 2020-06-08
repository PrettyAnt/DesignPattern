package com.prettyant.factorypattern.store;

import com.prettyant.factorypattern.style.ChicagoStyleCheesePizza;
import com.prettyant.factorypattern.style.ChicagoStyleClamPizza;
import com.prettyant.factorypattern.style.ChicagoStyleGreekPizza;
import com.prettyant.factorypattern.style.ChicagoStylePepperoniPizza;
import com.prettyant.factorypattern.style.ChicagoStyleVeggiePizza;
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
public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {

    }

    @Override
   protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new ChicagoStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
