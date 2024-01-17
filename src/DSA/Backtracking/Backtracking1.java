package DSA.Backtracking;

public class Backtracking1 {
    public static void main(String[] args) {

        System.out.println(factorial(3));

        System.out.println(factorialByRecursion(3));
    }


    public static int factorial(int num){

        int res=1;
        for (int i = 1; i <= num; i++) {
            res=res*i;
        }
        return res;
    }

    public static int factorialByRecursion(int num){

       if(num==0){
        return 1;
       }else{
        return (num*factorialByRecursion(num));
       }
    }
}
