package lang.wrapper;

public class WrapperVsPrimitive {

    // 래퍼를 사용하는 것이 메모리, 속도 측면에서 약 5~10배 정도 차이가 남
    // 근데 10억번 계산 시에 0.3초, 1.5 ~ 3초 차이가 나는거지 그 이하에선 별 차이 없음
    // 결국 유지보수하기 좋은 코드로 작성해도 된다!
    // 래퍼 클래스는 불변임
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");


        // 래퍼 클래스 long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long 실행 시간: " + (endTime - startTime) + "ms");
    }

}
