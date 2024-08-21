package Stratagy.FlyingShit;

import Behavior.FlyingBehavior;

public class NoFly implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("i can not fly((");
    }
}
