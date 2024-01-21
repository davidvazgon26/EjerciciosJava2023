package Challenges.JavaOracleOCA1Z0819;

import java.sql.SQLException;

public class Excepciones {
    public static void main(String[] args) {

    }

    public static void doSomething() {
        throw new NullPointerException();
        throw new StackOverflowError();
        throw new Exception();
        throw new SQLException();
    }
}
