package Challenges.JavaOracleOCA1Z0819;

public class Comparaciones {

    public static void main(String[] args) {
        System.out.println("Comparando valores primitivos");

        int a = 10;
        int b = 10;

        System.out.println("a y b son iguales? " + (a == b));

        System.out.println("*********************************");
        System.out.println("Comparando objetos");
        // 2 formas distintas de crear un objeto
        Integer z = 15;
        // Integer y = new Integer(15); // Deprecado
        Integer y = Integer.valueOf(15);

        System.out.println("Los objetos son iguales? " + (z == y)); // Con el constructor daria falso
        System.out.println("Comparando objetos, es: " + (z.equals(y)));

        System.out.println("**********************************");

        System.out.println();
    }

}
