package DesignPatterns;


 interface OperatingSystem {

    void Display();
}

class Windows implements OperatingSystem{

    @Override
    public void Display() {
        System.out.println("Windows Operting System");
    }
    
}
class Linux implements OperatingSystem{
    
    @Override
    public void Display() {
        System.out.println("Linux Operting System");
        
    }
    
}
class MacOS implements OperatingSystem{
    
    @Override
    public void Display() {
        System.out.println("MacOS Operting System");
        
    }
    
}

class OSFactory{

    public static OperatingSystem getOperatingSystem(String os){

        if(os.contains("windows")){
            return new Windows();
        }else if(os.contains("linux")){
            return new Linux();
        }else{
            return new MacOS();
        }


    }


}


public class Factory {

    public static void main(String[] args) {
        OperatingSystem operatingSystem=OSFactory.getOperatingSystem("linu");


        operatingSystem.Display();
    }
    
}



