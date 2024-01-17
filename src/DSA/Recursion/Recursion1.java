package DSA.Recursion;

public class Recursion1 {

    public static void main(String[] args) {
        message(1);
    }

    public static void message(int n){
        System.out.println(n);   
        message1(2);
    }
    
    
    public static void message1(int n){
        System.out.println(n);
        message2(3);   
    }

    
    public static void message2(int n){
        System.out.println(n);   
        message3(4);
    }

    
    public static void message3(int n){
        System.out.println(n);   
        message4(5);
    }

    
    public static void message4(int n){
        System.out.println(n);   
    }
}
