public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "Shubham";
        System.out.println(s1.hashCode());

        s1 = "Sapkal";
        System.out.println(s1.hashCode());
        
        System.out.println("----------------------------------------");
        String s2 = "Shubz-";
        System.out.println(s2);
        System.out.println(s2.hashCode());
        s2.concat("Programmer");
        System.out.println(s2);

        System.out.println("----------------------------------------");
        String s3 = "Shubz-";
        System.out.println(s3);
        System.out.println(s3.hashCode());
        s3=s3.concat("Programmer");
        System.out.println(s3);
    }
}
