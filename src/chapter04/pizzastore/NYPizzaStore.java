package chapter04.pizzastore;

import chapter04.pizza.NYStyleCheesePizza;
import chapter04.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
