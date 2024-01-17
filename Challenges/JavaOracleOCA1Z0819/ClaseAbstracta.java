package Challenges.JavaOracleOCA1Z0819;

public abstract class ClaseAbstracta {
    void eat() {
        System.out.println("Animal");
    };

    public static void main(String[] args) {
        ClaseAbstracta d = new Heradada();
        d.eat();
    }

    public static void MetodoEstatico() {
        System.out.println("Hola desde el metodo estatico");
    }

}

class Heradada extends ClaseAbstracta {
    public void eat() {
        /*
         * public
         * protected
         * [default]
         * private
         */
        super.eat();
        System.out.println("Dog");
        ClaseAbstracta.MetodoEstatico();
    }

    public abstract class Animal { // La clase abstracta no lleva parentesis
        abstract void eat();
    }

    abstract class Dog extends Animal {
        abstract void sleep();
    }

    class Pitbull extends Dog {

        @Override
        void sleep() {
            throw new UnsupportedOperationException("Unimplemented method 'sleep'");
        }

        @Override
        void eat() {
            throw new UnsupportedOperationException("Unimplemented method 'eat'");
        }

    }
}
