public class EqualsComparison {
    public static void main(String[] args) {
        String s1="Shubham";
        String s2="Shubham";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println("=====================");

        String s3=new String("Sapkal");
        String s4=new String("Sapkal");

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        System.out.println("=====================");

        String s5="Rohan";
        String s6=new String("Rohan");
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

        System.out.println("=====================");

        //NOTE
        // == compare references
		// equals - value
    }
}
