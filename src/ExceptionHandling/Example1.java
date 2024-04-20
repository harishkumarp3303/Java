package ExceptionHandling;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    

    public static void main(String[] args) {
        

        Map<Desk,String> map=new HashMap<>();

        map.put(new Desk(1), "First");
        map.put(new Desk(1), "Second");
        map.put(new Desk(3), "Third");

        map.forEach((x,y)->{
            
            System.out.println(x.getSize());
            System.out.println(y);
        });

        

    }
}

