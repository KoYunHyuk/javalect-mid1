package lang.string.builder;

public class LoopStringBuilderMain {
    // StringBuilder 를 사용하는 것이 더 좋은 경우
    // 1. 반복문에서 반복해서 문자를 연결할 때
    // 2. 조건문을 통해 동적으로 문자열을 조합할 때
    // 3. 복잡한 문자열의 특정 부분을 변경해야 할 때
    // 4. 매우 긴 대용량 문자열을 다룰 때
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<100000; i++){
            sb.append("Hello Java ");
        }

        long endTime = System.currentTimeMillis();
        String result = sb.toString();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
