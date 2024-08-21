package chap1.Stratagy.SwimmingShit;

import chap1.Behavior.SwimmingBehavior;

public class SwimUnderWaterAndOnSurface implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim both:underwater and on the surface");
    }
}
