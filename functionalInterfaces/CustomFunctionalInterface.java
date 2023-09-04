package functionalInterfaces;


public class CustomFunctionalInterface {
    @FunctionalInterface
    interface MyFunction{
        void perform();
//       String toString();
    }
        public static void main(String[] args) {
            // Using the custom functional interface
            MyFunction sayHello = new MyFunction() {
                @Override
                public void perform() {
                    System.out.println("Afridi");
                }
            };
            sayHello.perform(); // Output:  Afridi
        }

}



