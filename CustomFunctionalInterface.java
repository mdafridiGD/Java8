



public class CustomFunctionalInterface {
    @FunctionalInterface
    interface MyFunction{
        void perform();
    }
        public static void main(String[] args) {
            // Using the custom functional interface
            MyFunction sayHello = () -> System.out.println("Hello, World!");

            sayHello.perform();  // Output: Hello, World!
        }
    }


