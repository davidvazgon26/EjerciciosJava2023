package Challenges.JavaOracleOCA1Z0819;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        System.out.println("Usando el buble: ");
        int[] miArray = { 15, 28, 13, 10, 9, 44, 16, 5 };
        int[] result;

        result = bubble(miArray);
        System.out.println(result.length);
        System.out.println(result[0]);
        System.out.println(result[result.length - 1]);
        System.out.println(Arrays.toString(result));

        System.out.println("Mostrar el uso de forEach con arreglos");

        String[] nombres = new String[3];
        nombres[0] = "David";
        nombres[1] = "Ale";
        nombres[2] = "Juan";

        for (String elemento : nombres) {
            System.out.println(elemento);
        }

        System.out.println("Mostrar el uso de forEach con listas");
        List<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Primer nombre");
        listaNombres.add("David");
        listaNombres.add("Tercer nombre");
        listaNombres.add("Cuarto nombre");

        for (String nombre : listaNombres) {
            if ("David".equalsIgnoreCase(nombre)) {
                continue;
            }
            System.out.println(nombre);
        }
    }

    public static int[] bubble(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        return A;
    }
}
