package Stratagy.SwimmingShit;

import Behavior.SwimmingBehavior;

public class SwimOnSurface implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim only on surface,not underwater");
    }
}
