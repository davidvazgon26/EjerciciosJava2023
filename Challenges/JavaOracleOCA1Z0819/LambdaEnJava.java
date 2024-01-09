package Challenges.JavaOracleOCA1Z0819;

import java.util.ArrayList;
import java.util.List;

public class LambdaEnJava {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("David");
        people.add("Lucas");
        people.add("Martha");
        people.add("Gabriel");

        people.forEach(el -> System.out.println(el));

        people.removeIf(name -> name.startsWith("G"));

        System.out.println(people);
    }
}
