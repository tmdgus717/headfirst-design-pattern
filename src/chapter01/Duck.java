package chapter01;

import chapter01.strategies.fly.FlyBehavior;
import chapter01.strategies.quack.QuackBehavior;

public abstract class Duck {

    //행동 인터페이스 형식의 레퍼런스 변수 선언
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다.");
    }

    //==세터 메서드를 통해 동적으로 행동 지정하기==//
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
