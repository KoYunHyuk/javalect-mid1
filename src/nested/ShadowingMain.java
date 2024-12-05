package nested;

public class ShadowingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;

            // 3
            System.out.println("value = " + value);
            // 2
            System.out.println("this.value = " + this.value);
            // 1
            System.out.println("ShadowingMain.value = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
