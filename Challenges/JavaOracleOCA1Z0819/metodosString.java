package Challenges.JavaOracleOCA1Z0819;

public class metodosString {
    public static void main(String[] args) {
        String text = "David Vaz";
        System.out.println(text.charAt(2)); // v
        System.out.println(text.length()); // 9
        System.out.println(text.toUpperCase()); // DAVID VAZ
        System.out.println(text.concat(" Dev")); // David Vaz Dev
        System.out.println(text.contains("vid")); // true
        System.out.println(text.trim()); // Davidvaz
        System.out.println(text.replace("a", "o")); // Dovid Voz
        System.out.println(text.startsWith("da")); // false
        System.out.println(text.indexOf("a")); // 1
        System.out.println(text.substring(3)); // id Vaz
        System.out.println(text.substring(0, 3)); // Dav
        System.out.println(text.equalsIgnoreCase("David Vaz")); // true

    }
}
