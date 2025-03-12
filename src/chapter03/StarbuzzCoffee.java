package chapter03;

import chapter03.beverage.Beverage;
import chapter03.beverage.DarkRoast;
import chapter03.beverage.Espresso;
import chapter03.beverage.HouseBlend;
import chapter03.condiment.Mocha;
import chapter03.condiment.Soy;
import chapter03.condiment.Whip;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
