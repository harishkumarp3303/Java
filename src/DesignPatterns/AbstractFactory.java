package DesignPatterns;

import java.util.Optional;
import java.util.Scanner;

public class AbstractFactory {
    

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();
        Button button ;
        CheckBox checkBox;

        
    }
}

interface Button{
    void paint();
}

interface CheckBox{
    void check();
}


class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Paint from Windows Button");
    }
    
}

class MacButton implements Button{

    @Override
    public void paint() {
        System.out.println("Paint from Mac Button ");
    }
    
}

class WindowsCheckBox implements CheckBox{

    @Override
    public void check() {
        System.out.println("Windows CheckBox checked");
    }
    
}

class MacCheckBox implements CheckBox{

    @Override
    public void check() {
        System.out.println("Mac CheckBox checked");
    }
    
}







