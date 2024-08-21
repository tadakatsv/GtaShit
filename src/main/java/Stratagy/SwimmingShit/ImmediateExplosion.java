package Stratagy.SwimmingShit;

import Behavior.SwimmingBehavior;

public class ImmediateExplosion implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("Immediate explosion as soon as touch water");
    }
}
