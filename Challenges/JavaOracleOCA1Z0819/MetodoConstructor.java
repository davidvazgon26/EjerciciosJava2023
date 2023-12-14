package Challenges.JavaOracleOCA1Z0819;

public class MetodoConstructor {
    // si no lo creas especificamente java usa el constructor por defecto

    String name = "123";

    {
        name = "ABC";
    }

    // Ejercicio de asignacion
    {
        result = "Test1";
        result2 = "Test2";
        result3 = "Test3";
    }

    String result = "";
    String result2 = "CAmbio";
    String result3;

    // Fin ejercicio de asignacion

    public static void main(String[] args) {
        MetodoConstructor s = new MetodoConstructor();
        s.name = "David";

        System.out.println(s.name);
        System.out.println(s.result);
        System.out.println(s.result2);
        System.out.println(s.result3);
    }

}

// usar final en una variable hace que solo se le pueda asignar una vez un valor
// a dicha variable y debe ser instanciado o asignado el valor obligatoriamente
