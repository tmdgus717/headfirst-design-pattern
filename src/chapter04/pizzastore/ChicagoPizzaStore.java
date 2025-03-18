package chapter04.pizzastore;

import chapter04.pizza.ChicagoStyleCheesePizza;
import chapter04.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
