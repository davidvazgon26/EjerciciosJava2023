package Challenges.JavaOracleOCA1Z0819;

/**
 * @author David Vazquez
 */
public class Person {
    String name = "David";

    /**
     * Comentarios para la documentacion del codigo
     * 
     * @return devuelve un string
     */
    public String getName() {
        // this.getName();

        return name;
    }

}

/**
 * Ojo Java no exige mencionar el modificador de acceso en el archivo si es una
 * clase unica.
 * 
 * Si en el archivo existe mas de una clase, una de ellas debe ser publica y a
 * la que se le asigne el modificador public debe llevar el mismo nombre del
 * archivo.
 */