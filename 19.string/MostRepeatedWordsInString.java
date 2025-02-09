import java.util.Arrays;

public class MostRepeatedWordsInString {
    static void countWord(String str) {
        str=str.toLowerCase();
        String words[] = str.split("\\s");

        System.out.println(Arrays.toString(words));
       int maxCount=0;
       int count=0;
       String mWord="";
        for(int i=0;i<words.length;i++){
            //System.out.println(words[i]);
            if(words[i].equals("visited"))
             continue;
             count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="visited";
                }
            }
            if(count>maxCount){
                maxCount=count;
                mWord=words[i];
            }
        }
        System.out.println("Most Repeated Word: "+mWord );
       
    }
    public static void main(String[] args) {
        String str="Java is great Java is fun ,java is oops";
        countWord(str);
    }
}
