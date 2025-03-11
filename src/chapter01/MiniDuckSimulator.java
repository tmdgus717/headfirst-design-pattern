package chapter01;

import chapter01.strategies.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        //Duck 추상클래스의 메서드 이용
        mallard.performQuack();
        mallard.performFly();

        System.out.println();
        //==테스트2. 동적으로 행동 변경하기==//
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
