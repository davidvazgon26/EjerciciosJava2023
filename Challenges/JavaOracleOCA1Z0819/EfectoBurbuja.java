package Challenges.JavaOracleOCA1Z0819;

public class EfectoBurbuja {
    public static void main(String[] args) {

        David: for (int i = 0; i < 10; i += 2) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i: " + i);
                System.out.println("j: " + j);
                if (i == 6)
                    break David;
            }
        }

        System.out.println("******************************************");

        for (int i = 0, j = 0; i < 10 && j < 5; i++, j++) {
            System.out.println(i);
            System.out.println(j);
        }
    }
}
