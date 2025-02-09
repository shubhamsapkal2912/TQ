public class DuplicateCharacter {
    static String removeDuplicate(String str) {
        String s = "";
        boolean found;
        for (int i = 0; i < str.length(); i++) {
            found = false;
            for(int j=0;j<s.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                s=s+str.charAt(i);
            }

        }
        return s;
    }

    static String replace(String str){
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch[j]='#';
                }
            }
        }
        //return String(ch);
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "missisipi";
        //str=removeDuplicate(str);
        str=replace(str);
        System.out.println(str);

    }
}
