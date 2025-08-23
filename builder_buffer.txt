public class Main{
    public static void main(String[] args) {
        System.out.println("=== STRINGBUFFER DEMONSTRATION ===");
        
        // Creating a StringBuffer
        StringBuffer buffer = new StringBuffer("Hello World");
        System.out.println("Original Buffer: " + buffer);
        
        // 1. length() method
        System.out.println("\n1. length() method:");
        System.out.println("Buffer length: " + buffer.length());
        
        // 2. substring() methods
        System.out.println("\n2. substring() methods:");
        System.out.println("Substring from index 0 to 5: " + buffer.substring(0, 5));
        System.out.println("Substring from index 6: " + buffer.substring(6));
        
        // 3. setCharAt() method
        System.out.println("\n3. setCharAt() method:");
        buffer.setCharAt(0, '@');
        System.out.println("After setting char at index 0 to '@': " + buffer);
        
        // 4. capacity() method
        System.out.println("\n4. capacity() method:");
        StringBuffer sb = new StringBuffer();
        System.out.println("Default capacity: " + sb.capacity()); // default 16
        sb.append("Hello");
        System.out.println("Capacity after appending 'Hello': " + sb.capacity()); // still 16
        sb.append("java is my favourite language");
        System.out.println("Capacity after appending long string: " + sb.capacity());
        System.out.println("Explanation: New capacity = (oldcapacity * 2) + 2");
        
        // 5. append() method
        System.out.println("\n5. append() method:");
        StringBuffer appendDemo = new StringBuffer("Hello");
        appendDemo.append(" ").append("World").append("!").append(123);
        System.out.println("After multiple appends: " + appendDemo);
        
        // 6. insert() method
        System.out.println("\n6. insert() method:");
        StringBuffer insertDemo = new StringBuffer("Hello World");
        insertDemo.insert(5, " Beautiful");
        System.out.println("After inserting at position 5: " + insertDemo);
        
        // 7. delete() and deleteCharAt() methods
        System.out.println("\n7. delete() and deleteCharAt() methods:");
        StringBuffer deleteDemo = new StringBuffer("Hello World");
        deleteDemo.delete(5, 11);
        System.out.println("After deleting from index 5 to 10: " + deleteDemo);
        deleteDemo.deleteCharAt(0);
        System.out.println("After deleting char at index 0: " + deleteDemo);
        
        // 8. reverse() method
        System.out.println("\n8. reverse() method:");
        StringBuffer reverseDemo = new StringBuffer("Hello");
        reverseDemo.reverse();
        System.out.println("After reversing: " + reverseDemo);
        
        // 9. replace() method
        System.out.println("\n9. replace() method:");
        StringBuffer replaceDemo = new StringBuffer("Hello World");
        replaceDemo.replace(6, 11, "Java");
        System.out.println("After replacing 'World' with 'Java': " + replaceDemo);
        
        
        System.out.println("\n=== STRINGBUILDER DEMONSTRATION ===");
        
        // Creating a StringBuilder (same API as StringBuffer but not thread-safe)
        StringBuilder builder = new StringBuilder("Hello Builder");
        System.out.println("Original Builder: " + builder);
        
        // All the same methods work with StringBuilder
        builder.append("!");
        System.out.println("After appending '!': " + builder);
        
        builder.reverse();
        System.out.println("After reversing: " + builder);
        
        
    }
}