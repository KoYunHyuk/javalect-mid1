package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int parameter) {
        int localVar = 1;

        // 지역 클래스
        class LocalPrinter {
            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("parameter = " + parameter);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

            int value = 0;
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }

}
