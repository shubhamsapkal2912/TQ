public class Calculate {

    static void display(String str) {
        char ch[] = str.toLowerCase().toCharArray();
        int vowel=0;
        int consonants=0;
        int special_char=0;
        int digits=0;
        for(int i=0;i<ch.length;i++){
            if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')){
                vowel++;
            }
            else if((ch[i]>=33)&&(ch[i]<=47)){
                special_char++;
            }
            else if((ch[i]>='0')&&(ch[i]<='9')){
                digits++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+consonants);
        System.out.println("Digits: "+digits);
        System.out.println("Special Chars: "+special_char);
    }

    public static void main(String[] args) {
        String str = "shubham123#$";
        System.out.println(str);
        display(str);
    }
}
