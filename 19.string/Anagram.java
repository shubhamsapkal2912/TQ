public class Anagram {

    
    static void sortArray(char[] arr) {
        char temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static boolean isAnagram(String str1, String str2) {
        boolean ans = true;
        
        if (str1.length() == str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            
            sortArray(ch1);
            sortArray(ch2);

            // Compare sorted arrays
            for (int i = 0; i < ch2.length; i++) {
                if (ch1[i] != ch2[i]) {
                    ans = false;
                }
            }
        } else {
            ans = false;
        }

        return ans;
    }

    public static void main(String[] args) {
        String str1 = "Ant";
        String str2 = "Tan";
        
        boolean ans = isAnagram(str1, str2);
        
        if (ans) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
