public class Main {
    public static void main(String[] args) {
        MountainBike bmx = new MountainBike(2, 3,5);

        bmx.speedUp(20);
        System.out.println(bmx.getGear());
        System.out.println(bmx.getSpeed());
        bmx.setSpeed(3);
        System.out.println(bmx.getSpeed());
        bmx.applyBrake(2);
        System.out.println(bmx.getSpeed());
    }
}