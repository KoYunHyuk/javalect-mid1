package exception.ex3.exception;

// 전송 실패 시 발생되는 예외
// 내부 전송을 시도한 데이터(sendData) 보관
public class SendExceptionV3 extends NetworkClientExceptionV3{

    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
