package chap1.Stratagy.SwimmingShit;

import chap1.Behavior.SwimmingBehavior;

public class SwimOnSurface implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim only on surface,not underwater");
    }
}
