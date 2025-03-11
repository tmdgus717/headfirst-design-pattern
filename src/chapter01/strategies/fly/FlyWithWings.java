package chapter01.strategies.fly;

public class FlyWithWings implements FlyBehavior{
    //나는 방법을 구현
    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
