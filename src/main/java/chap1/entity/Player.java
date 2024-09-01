package chap1.entity;

import chap1.entity.vehicles.Vehicle;

public class Player {

    private UserState userState;

    private Vehicle currentVehicle = null;

    public Player() {
        this.userState = UserState.ALIVE;
    }

    public void sitInsideVehicle(Vehicle vehicle) {
        if (preActionValidation()) {
            System.out.println("YO IM DED");
            return;
        }

        currentVehicle = vehicle;
        System.out.printf("I sat inside: [%s]%n", currentVehicle.getName());
    }

    public void getOutOfVehicle() {
        if (preActionValidation()) {
            System.out.println("YO IM DED");
            return;
        }

        System.out.printf("I got out of [%s]%n", currentVehicle.getName());
        currentVehicle = null;
    }

    public void drive(Terrain terrain) {
        if (preActionValidation()) {
            System.out.println("YO IM DED");
            return;
        }

        currentVehicle.use(terrain, this);
    }

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentVehicle(Vehicle currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    private boolean preActionValidation() {
        return userState == UserState.DEAD;
    }

    public enum UserState {
        ALIVE, DEAD
    }
}
