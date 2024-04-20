package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArraylistExample1 {
    

    

    public static void main(String[] args) {
        

        List<Integer> li1=Stream.of(1,2,3,4,5).toList();
        List<Integer> li2=Stream.of(4,5,6,7,8).toList();
        
        List<Integer> commonElements=new ArrayList<>();


        for (int i = 0; i < li1.size(); i++) {
            for (int j = 0; j < li2.size(); j++) {
                if(i!=j){
                    if(li1.get(i)==li2.get(j)){
                        commonElements.add(li1.get(i));
                        break;
                    }
                }
            }
        }

        // another approach 
         List<Integer> list = li1.stream().filter(x->{
            boolean temp=false;

            for (int i = 0; i < li2.size(); i++) {
                if(x==li2.get(i)){
                    temp=true;
                }
            }

            return temp;
        }).toList();


        System.out.println(list);


        // easy approach

        List<Integer> list3=li1.stream().filter(x->li2.contains(x)).toList();

        System.out.println("List 3 : "+list3);

    }
}
