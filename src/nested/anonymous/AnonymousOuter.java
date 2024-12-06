package nested.anonymous;

import nested.local.Printer;

// local.LocalOuterV2 코드를 익명 클래스로 수정
public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int parameter) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("parameter = " + parameter);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }

}
