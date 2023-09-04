package defaultMethods;

public class Bike implements Vehicle,NonLiving {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stop");
    }

    @Override
    public void horn() {
        NonLiving.super.horn();
    }

    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.horn();
//        output will be "Default Vehicle Horn"
    }
}
