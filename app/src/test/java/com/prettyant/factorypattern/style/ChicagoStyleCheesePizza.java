package com.prettyant.factorypattern.style;

/**
 * @author ChenYu
 * Author's github https://github.com/PrettyAnt
 * <p>
 * Created on 11:43 PM  2020/6/7
 * PackageName : com.prettyant.factorypattern.style
 * describle :
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Cheese Pizza";
        dough = "Extra Thick Cust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(String style) {
        System.out.println("Cutting the pizza into square slices");
    }
}
