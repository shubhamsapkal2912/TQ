public class Palindrome {

    static boolean isPalindrome(String str){
        boolean ans=false;
        char ch[]=str.toCharArray();
        //int len=ch.length;
        char ch2[]= new char[ch.length];
        for(int i=ch.length-1;i>=0;i--){
            
        }
        
        if(ch==ch2){
            ans=true;
        }

        return ans;
    }
    public static void main(String[] args) {
        String str="madam";
        boolean ans=isPalindrome(str);
        if(ans){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
