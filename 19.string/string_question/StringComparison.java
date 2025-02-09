public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "World";

        // Using '=='
        System.out.println("s1 == s2 : " + (s1 == s2)); // true (same string literal reference)
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (different object)

        // Using equals()
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true (same content)
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true (same content)
        System.out.println("s1.equals(s4) : " + s1.equals(s4)); // false (different content)

        // Using compareTo()
        System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2)); // 0 (equal)
        System.out.println("s1.compareTo(s4) : " + s1.compareTo(s4)); // negative (-15) → "Hello" < "World"
        System.out.println("s4.compareTo(s1) : " + s4.compareTo(s1)); // positive (15) → "World" > "Hello"
    }
}
