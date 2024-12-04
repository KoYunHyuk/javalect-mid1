package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        nested.nested.ex1.NetworkMessage networkMessage = new nested.nested.ex1.NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
