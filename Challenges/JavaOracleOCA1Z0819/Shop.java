package Challenges.JavaOracleOCA1Z0819;

public class Shop {

    public static void main(String[] args) {
        System.out.println("Comenrtario dentro de main");
        System.out.println("Valor introducido: " + args[0]);
        System.out.println("Valor 2 introducido: " + args[1]);
        Example("David", "Alejandro", "Vazquez", "Gonzalez");
    }

    private static void Example(String... args) {
        System.out.println(args[0] + " " + args[1]);
    }
}

/**
 * Para correr el codigo en VSC recuerda correrlo con el Run que aparece dentro
 * del codigo, en este caso arriba del main\
 * 
 * 
 * El arreglo de string permite recibir valores para presentar , por ejemplo en
 * la consola, cada uno es separado por espacio
 * 
 * ejemplo, compilas con javac y ejecutas con java, ej: $ java
 * Challenges/JavaOracleOCA1Z0819/Shop David
 * 
 * Cuando compilas, si el archivo contiene mas de una classe, este generara un
 * archivo tipo .class por cada clase dentro del archivo.
 */
