package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample1 {
    

    public static void main(String[] args) {
        
        Map<String,Integer> map=new HashMap<>();
        System.out.print("Enter the number of players : ");


        Scanner sc=new Scanner(System.in);

        int noPlayers=sc.nextInt();

        for (int i = 1; i <= noPlayers; i++) {
            System.out.print("Enter name of player "+i+" : ");
            String name=sc.next();
            map.put(name, null);
        }

        map.forEach((x,y)->{
            System.out.print("Enter runs scored by "+x+" : ");
            map.put(x, sc.nextInt());
        });


                String maxName;
                String minName;
                Integer max=0;
                Integer min=0;


        map.forEach((x,y)->{
            System.out.print(x);
            System.out.print(" : ");
            System.out.println(y);
         
        });



        


    }
}
