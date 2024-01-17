package DSA.Recursion;

public class Recursion4 {
    public static void main(String[] args) {
        Sum(1, 2);
    }

    public static int Sum(int a,int b){
        if(a==100){
            return 0;
        }
        System.out.println(a+"   "+b);
        return Sum(a+1, b+1);
    }
}
