package chap1.Stratagy.SwimmingShit;

import chap1.Behavior.SwimmingBehavior;

public class OnlySinking implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I cant swim");
    }
}
