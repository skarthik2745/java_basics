public class Main {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "BANANA";
        String str3 = "APPLE"; // All caps

        // 1. apple vs APPLE (now considered equal)
        System.out.println("apple vs APPLE (ignore case): " + str1.compareToIgnoreCase(str3)); // 0

        // 2. apple vs BANANA (a comes before b, regardless of case)
        System.out.println("apple vs BANANA (ignore case): " + str1.compareToIgnoreCase(str2)); // Negative number

        // 3. Comparison with different cases but same "value"
        System.out.println("Java vs JAVA: " + "Java".compareToIgnoreCase("JAVA")); // 0

        // Practical use: Sorting a list case-insensitively
        String[] fruits = {"Orange", "apple", "BANANA", "Grape"};
        java.util.Arrays.sort(fruits); // Default sort (case-sensitive)

        System.out.println("Case-Sensitive Sort:");
        for (String fruit : fruits) {
            System.out.println("  " + fruit); // BANANA, Grape, Orange, apple (uppercase first)
        }

        // Using a custom comparator for case-insensitive sort
        java.util.Arrays.sort(fruits, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Case-Insensitive Sort:");
        for (String fruit : fruits) {
            System.out.println("  " + fruit); // apple, BANANA, Grape, Orange
        }
    }
}