package Challenges.JavaOracleOCA1Z0819;

public class ManipulandoStrings {
    public static void main(String[] args) {

        String text = "Hello World, how are you";
        String[] words = text.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        String[] fruit = { "apple", "orange", "mango", "banana" };
        String[] alias = fruit;
        System.out.println(fruit.equals(alias)); // true

        int[][] matrix = { { 5, 2, 6 }, { 3 }, { 5, 6, 8 } };
        System.out.println(matrix[1][0]);// 3
        System.out.println(matrix[2][2]);// 8
        System.out.println(matrix[1][1]);// exception

    }
}
