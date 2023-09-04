package defaultMethods;

public class Car implements Vehicle {
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
    @Override
    public void stop(){
        System.out.println("Car is stop");
    }

    public static void main(String[] args) {
        Vehicle car=new Car();
        car.start();
     }
}
