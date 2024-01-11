package Challenges.JavaOracleOCA1Z0819;

public class OverLoading {
    public static void main(String[] args) {

        System.out.println("Invocando a mi metodo Overloading...");
        // Crear una instancia de la clase OverLoading
        OverLoading instancia = new OverLoading();

        System.out.println(instancia.MiClase());
        System.out.println(instancia.MiClase("David"));
        System.out.println(instancia.MiClase("Alejandro", 43));
    }

    public String MiClase() {
        // System.out.println("aqui no recibo ningun parametro por lo que la firma es
        // sencilla");
        return "aqui no recibo ningun parametro por lo que la firma es sencilla";
    }

    public String MiClase(String nombre) {
        // System.out.println("Aqui recibo un string de tipo nombre igual a: " +
        // nombre);
        return "Aqui recibo un string de tipo nombre igual a: " + nombre;
    }

    public String MiClase(String nombre, int edad) {
        // System.out.println("Aqui recibo mi nombre: " + nombre + " y edad: " + edad);
        return "Aqui recibo mi nombre: " + nombre + " y edad: " + edad;
    }
}
