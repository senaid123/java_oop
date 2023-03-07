public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int seatHeight, int startSpeed,
                        int startGear){
        super(startSpeed, startGear);
        this.seatHeight = seatHeight;
    }
    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }
}
