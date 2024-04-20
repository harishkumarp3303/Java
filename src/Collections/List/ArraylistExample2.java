package Collections.List;
// Problem: Removing Duplicates

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Write a Java program that removes duplicate elements from an ArrayList of integers. Implement the following steps:

// Create an ArrayList and populate it with some integer values, including duplicates.
// Create a new ArrayList to store unique elements.
// Iterate through the original ArrayList, and for each element:
// Check if it's already present in the new ArrayList.
// If not present, add it to the new ArrayList.
// Finally, print the new ArrayList containing only unique elements.


// Example:

// Input:

// less
// Copy code
// Original List: [1, 2, 3, 4, 2, 5, 6, 1]
// Output:

// mathematica
// Copy code
// List with Duplicates Removed: [1, 2, 3, 4, 5, 6]

public class ArraylistExample2 {
    public static void main(String[] args) {


        List<Integer> list1 = Stream.of(1, 2, 3, 4, 2, 5, 6, 1).toList();
        

        // List<Integer> list2 = list1.stream().filter(x->!list1.contains(x)).toList();

        List<Integer> commonElements=new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if(i!=j){
                    if(list1.get(i)==list1.get(j)){
                        list1.remove(j);
                        break;
                    }
                }
            }
            
        }




        System.out.println(list1);



    }
}
