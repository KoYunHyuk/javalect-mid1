package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int putInstanceValue = 2;

    // 중첩 클래스는 상위 클래스의 private에 접근할 수 있는 것 빼고는 별개의 클래스라고 봐도 무방하다.
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
            //System.out.println(putInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
            System.out.println(outClassValue);
        }
    }
}
