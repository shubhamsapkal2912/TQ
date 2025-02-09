public class Occurance {
    static void occurance(String str){
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count=1;
           if(ch[i]=='v')
            continue;
                for(int j=i+1;j<ch.length;j++){
                    if(ch[i]==ch[j]){
                        count++;
                        ch[j]='v';
                    }
                }
                System.out.println(ch[i]+" : "+count);
            }
        }

 public static void main(String[] args) {
    String str1="missipii";
    occurance(str1);
 }   
}
