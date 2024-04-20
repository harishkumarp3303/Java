package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hasmapExample2 {
    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter number of seats : ");
        // Integer numberOfSeats=sc.nextInt();
        // Map<Integer,Status> avalabitlity=new HashMap<>(numberOfSeats);

        // for (int i = 1; i <= numberOfSeats; i++) {
        //     avalabitlity.put(i, Status.Avaliable);
        // }

        // avalabitlity.forEach((x,y)->{
        //     System.out.print(x+" : ");
        //     System.out.print(y+"   ");

        // });

        
        // using class


        Bus bus=new Bus(5);

        bus.getSeats();
        System.out.println("Booking Ticket");
        bus.Book(3, "Harish kumar");
        bus.getSeats();
        System.out.println("Cancelling ticket.....");
        bus.Cancel(3);
        bus.getSeats();

    }
}


enum Status{
    Avaliable,Booked
}


class Bus{

    Map<Integer,Seat> availability=new HashMap<>();

    

    public Bus(Integer numberOfSeats){
        for (int i = 1; i <= numberOfSeats; i++) {
            availability.put(i,new Seat("", Status.Avaliable));
        }
    }


    public void Update(){

    }

    public void Book(Integer ticketNumber,String name){
        Seat seat=availability.get(ticketNumber);

        if(seat.status.equals(Status.Avaliable)){
            seat.name=name;
            seat.status=Status.Booked;
        }
        
    }

    public void Cancel(Integer ticketNumber){

        Seat seat=availability.get(ticketNumber);
        seat.name="";
        seat.status=Status.Avaliable;
    }


    public void getSeats(){
        String seat="";
        
        for (Map.Entry<Integer,Seat> ele : availability.entrySet()) {
            seat=seat+ele.getKey()+" : "+ele.getValue().status+" "+ele.getValue().name+"   ";
        }

        System.out.println(seat);
    }
}



class Seat{

    String name="";

    Status status;

    public Seat(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    
}