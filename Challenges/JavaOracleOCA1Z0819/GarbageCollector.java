package Challenges.JavaOracleOCA1Z0819;

public class GarbageCollector {

    static Shop instance;
    String name;

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.name = "test";
        instance = shop;
    }
}
