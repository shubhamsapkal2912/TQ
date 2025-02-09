public class CreateString {

    public static void main(String[] args) {
        String s1 = "Shubham";
        String s2 = "Shubham";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3 = new String("Sapkal");
        String s4 = new String("Sapkal");
        // hascode is same as the new object points to object in SCP
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println("========================");
        String s5 = "hi";
        String s6 = new String("Java");
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());
    }
}