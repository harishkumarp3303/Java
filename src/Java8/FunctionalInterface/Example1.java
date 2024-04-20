package Java8.FunctionalInterface;
// can one functional interface extend another interface
public class Example1 {

    public static void main(String[] args) {
        
        Calculator calculator=()->10;

        System.out.println(calculator.calculate());



        Addition addition=()->6;

        System.out.println(addition.calculate());



    }
    
}


interface Calculator{
    public int calculate();
}

interface Addition extends Calculator{
    public int calculate();
}


