public class VarArgsOverloading {

   /*  public static void displayMe(int... varArgs_int) {
        for (int x : varArgs_int) {
            System.out.println(x);
        }
    }

    public static void displayMe(float... varArgs_float) {
        for (float x : varArgs_float) {
            System.out.println(x);
        }
    }

    public static void displayMe(double... varArgs_double) {
        for (double x : varArgs_double) {
            System.out.println(x);
        }
    }

    public static void displayMe(char... varArgs_char) {
        for (char x : varArgs_char) {
            System.out.println(x);
        }
    }

    public static void displayMe(String... varArgs_string) {
        for (String x : varArgs_string) {
            System.out.println(x);
        }
    }

    */

    public static void displayMe(char c,int... varArgs_int) {
        System.out.println(c);
        for (int x : varArgs_int) {
            System.out.println(x);
        }
    }
    public static void displayMe(int i,char... varArgs_char) {
        System.out.println(i);
        for (int x : varArgs_char) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
//displayMe();

displayMe('A',1,2,3,4);
displayMe(1,'A','B');
//displayMe(65,66,67);Ambiguity_Error->type promotion
    }
}
