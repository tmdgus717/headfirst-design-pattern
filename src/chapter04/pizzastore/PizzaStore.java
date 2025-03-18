package chapter04.pizzastore;

import chapter04.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /***
     * 팩토리 메서드 패턴
     * 추상 메서드를 만들고 서브클래승에서 인스턴스를 만들어 반환
     * 사용하는 서브 클래스에 따라 생산되는 객체 인스턴스가 결정된다
     * @param type
     * @return Pizza
     */
    protected abstract Pizza createPizza(String type);
}
