public class Bicycle {
    private int gear;
    protected int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear(){
        return gear;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public void applyBrakes(int decrement){
        speed -= decrement;
    }
}
