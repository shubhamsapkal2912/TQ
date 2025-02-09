public class StringMethods {
    public static void main(String[] args) {
        String str = "Java is Fun";
        // charAt
        System.out.println(str.charAt(1));
        //

        System.out.println("Concat");
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

        System.out.println("-----------------------");
        System.out.println("SubString");
        System.out.println(str.substring(4));
        System.out.println(str.substring(2, 4));

        System.out.println("-----------------------");
        System.out.println("Contains");
        System.out.println(str.contains("is"));
        System.out.println(str.contains("no"));

        System.out.println("-----------------------");
        String w1 = "hi";
        String w2 = "Hi";
        System.out.println(w1 == w2);
        System.out.println(w1.equals(w2));
        System.out.println(w1.equalsIgnoreCase(w2));

        System.out.println("-----------------------");
        System.out.println("CASE");
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println("-----------------------");
        // indexOf, lastIndexOf

        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        System.out.println(str.indexOf("fun"));

    }
}
