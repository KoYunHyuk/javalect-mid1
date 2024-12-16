package exception.ex3.exception;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data); // throw new RuntimeException("ex");
        } catch (ConnectExceptionV3 e) {
            /* NetworkClientExceptionV3와 순서가 바뀌면
               부모코드(NetworkClientExceptionV3)로 예외처리되기 때문에 Connection 예외를 잡지 못한다. */
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        }finally {
            client.disconnect();
        }
    }
}
