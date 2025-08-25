public class Main {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "Apple"; // Capital 'A'
        String str4 = "apple";

        // 1. str1 < str2 (a comes before b)
        System.out.println("apple vs banana: " + str1.compareTo(str2)); // Negative number

        // 2. str1 == str4 (strings are identical)
        System.out.println("apple vs apple: " + str1.compareTo(str4)); // 0

        // 3. str2 > str1 (b comes after a)
        System.out.println("banana vs apple: " + str2.compareTo(str1)); // Positive number

        // 4. Case Sensitivity: 'A' (65) vs 'a' (97)
        System.out.println("Apple vs apple: " + str3.compareTo(str1)); // Negative number

        // 5. Comparing different length strings ("abc" vs "abcd")
        System.out.println("abc vs abcd: " + "abc".compareTo("abcd")); // Negative number (shorter is less)
        System.out.println("abcd vs abc: " + "abcd".compareTo("abc")); // Positive number (longer is greater)

        // Practical use: Determining order
        int result = "zebra".compareTo("giraffe");
        if (result < 0) {
            System.out.println("zebra comes before giraffe");
        } else if (result > 0) {
            System.out.println("zebra comes after giraffe"); // This will print
        } else {
            System.out.println("zebra and giraffe are equal");
        }
    }
}