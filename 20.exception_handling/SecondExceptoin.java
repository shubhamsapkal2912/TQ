import java.util.Scanner;

public class SecondExceptoin {
    int id;
    String name;

    public static void main(String[] args) {
        Scanner sc = null;
        SecondExceptoin obj1 = new SecondExceptoin();

        try {
            sc = new Scanner(System.in);
            System.out.println("Enter id:");
            //java.util.InputMismatchException ---->if we enter name in id
            obj1.id = sc.nextInt();
            System.out.println("Enter name");
            obj1.name = sc.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
