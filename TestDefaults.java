public class TestDefaults implements DefaultMethods1,DefaultMethods2 {


    @Override
    public void print() {
        DefaultMethods1.super.print();
//        DefaultMethods2.super.print();
    }
}
