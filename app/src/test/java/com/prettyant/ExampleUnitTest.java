package com.prettyant;

import com.prettyant.factorypattern.factory.NYPizzaFactory;
import com.prettyant.factorypattern.store.NYPizzaStore;
import com.prettyant.factorypattern.store.PizzaStore;

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
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        PizzaStore     pizzaStore     = new NYPizzaStore(nyPizzaFactory);
        pizzaStore.orderPizza("veggie");
    }
}