package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Problem: Cricket Score Tracker

// You're tasked with creating a program to track the scores of a cricket match. The program should allow the user to input the runs scored by each batsman in their innings. Write a Java program to implement the following functionalities:

// Initialize an empty ArrayList to store the runs scored by each batsman.
// Prompt the user to input the runs scored by each batsman. The user should be able to enter the runs scored by each batsman one by one until they indicate that they are done entering scores.
// After entering all the runs, calculate and display the total score of the team.
// Calculate and display the average score of the team.
// Display the highest individual score among the batsmen.
// Display the number of batsmen who scored a half-century (50 or more runs) and the number of batsmen who scored a century (100 or more runs).
// Example:

// yaml
// Copy code
// Enter runs scored by each batsman (enter -1 to finish):
// Batsman 1: 10
// Batsman 2: 25
// Batsman 3: 45
// Batsman 4: 102
// Batsman 5: 5
// Batsman 6: 78
// Batsman 7: -1

// Total Score: 265
// Average Score: 44.17
// Highest Individual Score: 102
// Number of Half-Centuries: 3
// Number of Centuries: 1
// Your program should handle any number of batsmen and any runs scored by them.

// Feel free to implement this problem, and let me know if you need any further assistance!

public class CricketScoretracker {


    public static void main(String[] args) {
        
        // ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list = List.of(10, 25, 45, 102, 5, 78);

        // Scanner scanner = new Scanner(System.in);
        // int counter=0;
        // while (true) {
        //     System.out.print("Batman "+(++counter)+" => ");
        //     int temp=scanner.nextInt();
        //     if(temp==-1){
        //         break;
        //     }
        //     list.add(temp);

            

        // }


        System.out.println(list);


        System.out.println("Total Score => "+list.stream().reduce(0,(x,y)->x+y));


        System.out.println("Average Score => "+list.stream().collect(Collectors.averagingInt(i->i)));


        System.out.println("Highest Individual Score => "+list.stream().max((x,y)->x-y).get());


        System.out.println("Number of Half-Centuries => "+list.stream().filter(x->x>50).count());

        System.out.println("Number of Centuries => "+list.stream().filter(x->x>100).count());

    }
    
}
