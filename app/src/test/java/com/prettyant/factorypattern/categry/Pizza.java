package com.prettyant.factorypattern.categry;

/**
 * @author ChenYu
 * Author's github https://github.com/PrettyAnt
 * <p>
 * Created on 1:14 PM  2020/6/7
 * PackageName : com.example.prettyant
 * describle :
 */
public abstract class Pizza {
//    public Pizza orderPizz(String type) {
//        this.type = type;
//        Pizza pizza = null;
//        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        } else if (type.equals("greek")) {
//            pizza = new GreekPizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        } else if (type.equals("clam")) {
//            pizza=new ClamPizza();
//        } else if (type.equals("veggie")) {
//            pizza=new VeggiePizza();
//        }
//
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        return pizza;
//    }

    public void box(String type) {
        System.out.println("Pizza.box-->>"+type);
    }

    public void cut(String type) {
        System.out.println("Pizza.cut-->>"+type);
    }

    public void bake(String type) {
        System.out.println("Pizza.bake-->>"+type);
    }

    public void prepare(String type) {
        System.out.println("Pizza.prepare-->>"+type);
    }
}
