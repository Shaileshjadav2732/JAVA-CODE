package method;

public class method_overloding {

    static void sk(){
        //you can make multiple method as same name
        //method cannot perform by changing the return type of method
        System.out.println("hello bro!!");
    }
    static void sk(int a){
        System.out.println("Good morning !!");
    }
    static void sk(int a ,int b,int c){
        System.out.println("good morning "+a);
        System.out.println("good morning "+b);
        System.out.println("good morning "+c);
    }
    public static void main(String[] args){
        sk();
        System.out.println();
        sk(5);
        System.out.println();
        sk(3,4,5);
    }
}
