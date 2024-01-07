package Challenges.JavaOracleOCA1Z0819;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();

        System.out.println(one.equals(two)); // true
        one.add("a");
        System.out.println(one.equals(two)); // false
        two.add("a");
        System.out.println(one.equals(two)); // true
        one.add("b");
        two.add(0, "b");
        System.out.println(one);
        System.out.println(two);
        System.out.println(one.equals(two)); // false

        List<Double> scores = new ArrayList<>();
        scores.add(10.1);
        scores.add(15.4);
        scores.add((double) 30);
        System.out.println(scores);
        scores.remove(15.4);
        System.out.println(scores);
        double first = scores.get(1);
        System.out.println(first);
    }
}
