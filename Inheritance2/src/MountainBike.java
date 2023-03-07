public class MountainBike extends Bicycle{
    public int height;
    public MountainBike(int height, int gear, int speed) {
        super(gear, speed);
        this.height = height;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
