package com.prettyant.factorypattern.style;

import java.util.ArrayList;

/**
 * @author ChenYu
 * Author's github https://github.com/PrettyAnt
 * <p>
 * Created on 1:14 PM  2020/6/7
 * PackageName : com.example.prettyant
 * describle :
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings=new ArrayList();

    public void parepart(){
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   "+toppings.get(i));
        }
    }

    public void box(String type) {
        System.out.println("Pizza.box-->>" + type);
    }

    public void cut(String type) {
        System.out.println("Pizza.cut-->>" + type);
    }

    public void bake(String type) {
        System.out.println("Pizza.bake-->>" + type);
    }

    public void prepare(String type) {
        System.out.println("Pizza.prepare-->>" + type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
