class First {
Number value;

// Number display(){
//     return value;
// }

Object display(){
    return value;
}
}


class Second extends First{
Integer myValue;

// Number display(){
//     myValue=20;
//     return myValue;
// }

Integer display(){
    myValue=20;
    return myValue;
}
}

class Third extends First{
Character ch;
Character display(){
   ch='S';
   return ch;
}
}


public class CovariantWrapper {
    public static void main(String[] args) {
        First f1=new First();
        f1.value=100;
        System.out.println(f1.display());

        Second s1=new Second();
        System.out.println("Ans:"+(s1.display()+10));
        //System.out.println("Ans:"+(s1.display()));
    }
}
