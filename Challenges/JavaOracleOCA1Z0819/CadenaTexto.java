package Challenges.JavaOracleOCA1Z0819;

public class CadenaTexto {
    public static void main(String[] args) {
        String text = "";
        for (char character = 'a'; character <= 'z'; character++) {
            text += character;
        }
        System.out.println(text);

        StringBuilder cadena = new StringBuilder();
        for (char character = 'a'; character <= 'z'; character++) {
            cadena.append(character);
        }
        System.out.println(cadena);
    }
}
