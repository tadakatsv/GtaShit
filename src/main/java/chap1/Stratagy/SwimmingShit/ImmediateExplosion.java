package chap1.Stratagy.SwimmingShit;

import chap1.Behavior.SwimmingBehavior;

public class ImmediateExplosion implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("Immediate explosion as soon as touch water");
    }
}
