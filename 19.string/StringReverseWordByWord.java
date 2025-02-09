import java.util.Arrays;

public class StringReverseWordByWord {
    static void reverse(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        System.out.println("After Reverse: " + revStr);
    }

    static void reverseByWord(String str) {
        String words[] = str.split("\\s");
        System.out.println(Arrays.toString(words));
        String revStr = "";
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            for (int j = w.length() - 1; j >= 0; j--) {
                revStr = revStr + w.charAt(j);
            }
            revStr += " ";
        }
        System.out.println(revStr);
    }

    static void reverseWord(String str) {
        String words[] = str.split("\\s");
        System.out.println(Arrays.toString(words));
        String revStr = "";
        for (int i = words.length-1; i >=0; i--) {
            revStr=revStr+words[i];
            revStr+=" ";
        }
        System.out.println(revStr);
    }

    public static void main(String[] args) {
        String str = "I like to learn Java";
        System.out.println("Before Reverse : " + str);
        reverse(str);
        System.out.println("------------------------------------");
        reverseByWord(str);
        System.out.println("------------------------------------");
        reverseWord(str);

    }
}
