package chap1.Stratagy.SwimmingShit;

import chap1.entity.Player;

public class SwimUnderWaterAndOnSurface implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim both:underwater and on the surface");
    }

    @Override
    public void modify() {
        
    }

    @Override
    public void setDriver(Player player) {

    }
}
