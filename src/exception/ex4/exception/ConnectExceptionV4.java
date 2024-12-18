package exception.ex4.exception;

// 연결 실패시 발생되는 예외
// 내부에 연결을 시도한 주소(address)를 보관
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
