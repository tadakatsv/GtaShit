package Stratagy.FlyingShit;

import Behavior.FlyingBehavior;

public class FlyNormally implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying without any problems");
    }
}

