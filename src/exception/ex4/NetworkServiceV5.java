package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        // Try with resources 구문 - try 에서 빠져나가는 순간 AutoClosable 바로 실행!
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data); // 추가
            client.connect();
            client.send(data); // throw new RuntimeException("ex");
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}