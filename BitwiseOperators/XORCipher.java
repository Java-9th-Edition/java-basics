package BitwiseOperators;

public class XORCipher {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encodedMsg = "";
        String decodedMsg = "";
        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        for (int i = 0; i < msg.length() ; i++) {
            encodedMsg = encodedMsg + (char) (msg.charAt(i) ^ key);
        }

        System.out.print("encoded message: ");
        System.out.println(encodedMsg);

        for (int i = 0; i < msg.length(); i++) {
            decodedMsg = decodedMsg + (char) (encodedMsg.charAt(i) ^ key);
        }
        System.out.print("decoded message: ");
        System.out.println(decodedMsg);

    }
}
