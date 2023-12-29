package Challenges.JavaOracleOCA1Z0819;

public class GarbageCollector {

    static Shop instance;
    String name;

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.name = "test";
        instance = shop; // nunca finaliza su uso porque esta asociado a una variable por lo que seguira
                         // ocupando espacio en memoria
    }

    @Override // Este se usaba antes de java 9 para eliminar el objeto
    protected void finalize() {
        System.out.println("Delete object");
    }

    // Puedes llamar al GarbageCollector para que pase de inmediato con System.gc();
    // no se implementa ejemplo aqui
}
