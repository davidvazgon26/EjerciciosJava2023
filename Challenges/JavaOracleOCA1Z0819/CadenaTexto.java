package Challenges.JavaOracleOCA1Z0819;

public class CadenaTexto {
    public static void main(String[] args) {
        String text = "";
        for (char character = 'a'; character <= 'z'; character++) {
            text += character;
        }
        System.out.println(text);
    }
}
