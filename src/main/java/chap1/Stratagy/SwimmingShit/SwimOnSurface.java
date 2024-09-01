package chap1.Stratagy.SwimmingShit;

import chap1.entity.Player;

public class SwimOnSurface implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim only on surface,not underwater");
    }

    @Override
    public void modify() {
        
    }

    @Override
    public void setDriver(Player player) {

    }
}
