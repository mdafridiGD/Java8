package defaultMethods;

public interface Vehicle {
    void start();

    void stop();

    default void horn() {
        System.out.println("Default vehicle horn");
    }
}
