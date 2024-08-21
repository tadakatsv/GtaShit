package chap1.Stratagy.FlyingShit;

import chap1.Behavior.FlyingBehavior;

public class NoFly implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("i can not fly((");
    }
}
