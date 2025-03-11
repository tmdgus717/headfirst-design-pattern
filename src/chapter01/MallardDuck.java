package chapter01;

import chapter01.strategies.fly.FlyWithWings;
import chapter01.strategies.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        //행동을 다른 클래스에 위임
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
