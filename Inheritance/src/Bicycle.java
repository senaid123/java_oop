public class Bicycle {
    private int gear;
    private int speed;

    public Bicycle(int startSpeed, int startGear){
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
/*

    public void setGear(int gear) {
        this.gear = gear;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
*/

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

}
