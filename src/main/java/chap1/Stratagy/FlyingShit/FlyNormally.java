package chap1.Stratagy.FlyingShit;

import chap1.Behavior.FlyingBehavior;

public class FlyNormally implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying without any problems");
    }
}

