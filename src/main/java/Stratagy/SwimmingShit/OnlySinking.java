package Stratagy.SwimmingShit;

import Behavior.SwimmingBehavior;

public class OnlySinking implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("I cant swim");
    }
}
