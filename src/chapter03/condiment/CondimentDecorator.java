package chapter03.condiment;

import chapter03.beverage.Beverage;

//Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로 Beverage 를 확장
public abstract class CondimentDecorator extends Beverage {
    // 슈퍼클래스를 사용하여 어떤 음료든 감쌀 수 있도록한다
    Beverage beverage;
    //모든 첨가물 데코레이터에 새로 구현하도록 만든다
    public abstract String getDescription();
}
