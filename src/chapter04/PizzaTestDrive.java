package chapter04;

import chapter04.pizza.Pizza;
import chapter04.pizzastore.ChicagoPizzaStore;
import chapter04.pizzastore.NYPizzaStore;
import chapter04.pizzastore.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한 "+pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 "+pizza.getName()+"\n");

    }
}
