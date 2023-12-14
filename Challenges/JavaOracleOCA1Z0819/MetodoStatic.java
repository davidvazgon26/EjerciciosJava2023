package Challenges.JavaOracleOCA1Z0819;

import static java.lang.Math.abs;

import java.util.Random;

public class MetodoStatic {
    public static void main(String[] args) {
        abs(234);
        Random random = new Random();
        System.out.println(random.nextInt(10));
    }
}

// Todo lo de la libreria java.lang no es necesario importarlo, ya se incluye.

// las wildcards (*) son solo para importar clases, no paquetes.

// Si tienes metodos con el mismo nombre en diferentes paquetes y necesitas
// utilizarlos ambos, debes usar toda la ruta al crearlo.
