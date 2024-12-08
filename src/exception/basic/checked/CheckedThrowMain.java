package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();

        /*try {
            service.catchThrow();
        } catch (MyCheckedException e) {
            System.out.println("에러 발생: " + e.getMessage());
        }*/

        System.out.println("정상 종료");
    }
}
