package com.prettyant;

import com.prettyant.factorypattern.store.ChicagoPizzaStore;
import com.prettyant.factorypattern.store.NYPizzaStore;
import com.prettyant.factorypattern.store.PizzaStore;
import com.prettyant.factorypattern.style.Pizza;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    //    @Test
//    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
//    }
    private static final String TAG = "prettyant";

    @Test
    public void start() {
        PizzaStore nyStore      = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + pizza.getName() + "\n");
    }
}