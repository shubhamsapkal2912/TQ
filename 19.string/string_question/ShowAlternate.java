public class ShowAlternate {
    static void display(String str) {
        char ch[] = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i -= 2) {
            System.out.print(" " + ch[i]);
        }
    }

    public static void main(String[] args) {
        String str = "shubham";
        display(str);
    }
}