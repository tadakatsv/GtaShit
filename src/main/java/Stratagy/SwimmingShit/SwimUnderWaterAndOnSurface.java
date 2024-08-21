package Stratagy.SwimmingShit;

import Behavior.SwimmingBehavior;

public class SwimUnderWaterAndOnSurface implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim both:underwater and on the surface");
    }
}
