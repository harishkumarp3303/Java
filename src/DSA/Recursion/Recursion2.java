package DSA.Recursion;

public class Recursion2 {
    public static void main(String[] args) {
        message(2);
    }

    public static void message(int n){
        if(n==50){
            return ;
        }
        System.out.println(n);
        message(n+1);
    }


  
}
