package Challenges.JavaOracleOCA1Z0819;

public class TiposDatos {

    static int xx;
    static Integer i;

    public static void main(String[] args) {
        int n = 5000;
        byte b = 100;
        n = b + n; // En este caso si se puede porque el byte cabe perfectamente en el int, lo
                   // contrario no seria posible.
        System.out.println(n);

        char c = 'A' + 5; // Se puede hacer suma con los caracteres

        System.out.println(c);

        byte a = -128; // 128 es el limite de este tipo de dato
        a -= 50;
        System.out.println(a); // Le da la vuelta o dicho de otra manera se convnierte en positivo.

        long x = 5000000000L;
        double z = 500_000_000;

        x = x + (long) z;

        System.out.println(x);

        double bin = 0b10; // ninario
        System.out.println(bin);

        double y = 0x10; // Hexadecimal
        System.out.println(y);

        // Ojo los primitivos no pueden ser null, deben tener un valor, el null es solo
        // para objetos

        // Valor por defecto a variables no asignadas
        System.out.println(xx);
        System.out.println(i);
    }

}
