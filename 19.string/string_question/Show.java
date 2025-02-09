public class Show {
    static void count(String str, char chr) {
        int count = 0;
        char ch[] = str.toLowerCase().toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==chr){
                count++;
                System.out.println("Position: "+i);
            }
        }
        System.out.println("Count : "+count);
    }

    public static void main(String[] args) {
        String str = "shubham123#$";
        count(str, 'h');
    }
}
