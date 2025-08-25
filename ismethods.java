public class Main {
    public static void main(String[] args) {
        // Test characters for demonstration
        char[] testChars = {'A', 'a', '5', ' ', '$', '\n', 'α', '1', 'Z', 'z', '\t'};
        
        System.out.println("Character Class 'is' Methods Demonstration");
        System.out.println("==========================================");
        System.out.println("Test characters: A, a, 5, space, $, newline, α, 1, Z, z, tab");
        System.out.println();
        
        for (char c : testChars) {
            System.out.println("Character: '" + (c == '\n' ? "\\n" : c == '\t' ? "\\t" : c) + "'");
            System.out.println("  Unicode value: " + (int) c);
            
            // isUpperCase() - checks if character is uppercase letter
            System.out.println("  isUpperCase(): " + Character.isUpperCase(c));
            
            // isLowerCase() - checks if character is lowercase letter
            System.out.println("  isLowerCase(): " + Character.isLowerCase(c));
            
            // isDigit() - checks if character is a digit (0-9)
            System.out.println("  isDigit(): " + Character.isDigit(c));
            
            // isLetter() - checks if character is a letter
            System.out.println("  isLetter(): " + Character.isLetter(c));
            
            // isWhitespace() - checks if character is whitespace
            System.out.println("  isWhitespace(): " + Character.isWhitespace(c));
            
            // isLetterOrDigit() - checks if character is letter or digit
            System.out.println("  isLetterOrDigit(): " + Character.isLetterOrDigit(c));
            
            // isDefined() - checks if character is defined in Unicode
            System.out.println("  isDefined(): " + Character.isDefined(c));
            
            // isAlphabetic() - checks if character is alphabetic
            System.out.println("  isAlphabetic(): " + Character.isAlphabetic(c));
            
            
            System.out.println();
        }
        
        // Additional examples with more characters
        System.out.println("Additional Examples:");
        System.out.println("====================");
        
        char testChar = '@';
        System.out.println("Character: '" + testChar + "'");
        System.out.println("  isLetter(): " + Character.isLetter(testChar));
        System.out.println("  isLetterOrDigit(): " + Character.isLetterOrDigit(testChar));
        System.out.println("  isDefined(): " + Character.isDefined(testChar));
        
        testChar = '9';
        System.out.println("\nCharacter: '" + testChar + "'");
        System.out.println("  isDigit(): " + Character.isDigit(testChar));
        System.out.println("  isLetter(): " + Character.isLetter(testChar));
        System.out.println("  isAlphabetic(): " + Character.isAlphabetic(testChar));
        
        testChar = '漢'; // Chinese character
        System.out.println("\nCharacter: '" + testChar + "'");
        System.out.println("  isLetter(): " + Character.isLetter(testChar));
        System.out.println("  isAlphabetic(): " + Character.isAlphabetic(testChar));
        System.out.println("  isDefined(): " + Character.isDefined(testChar));
    }
}