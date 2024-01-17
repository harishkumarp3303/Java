package DSA.Recursion;

public class Recursion3 {
    public static void main(String[] args) {
        Multiply(12,1);
    }

    public static void Multiply(int n,int m){
        if(m==11){
            return;
        }
        System.out.println(n*m);
        Multiply(n, m+1);
    }
}
