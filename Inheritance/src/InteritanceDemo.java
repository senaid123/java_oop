public class InteritanceDemo {
    public static void main(String[] args) {
        Bicycle bmx = new Bicycle(2,5);
        MountainBike capriolo = new MountainBike(2,10,6);

        System.out.println(capriolo.getGear());
        System.out.println(capriolo.getSpeed());
        System.out.println(capriolo.getSeatHeight());

        capriolo.applyBreak(2);

        System.out.println(capriolo.getSpeed());
    }
}
