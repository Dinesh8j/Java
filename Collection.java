import java.util.*;
public class Main{
    public static void main(String[] args) {
        try{
        Scanner sc=new Scanner(System.in);
        
        FlightManagementSystem a=new FlightManagementSystem();
        //System.out.println(sc.nextLine());
        //List<Flight> x=new ArrayList<Flight>();
        //Flight obj=new Flight(10,"India","China",5,8.0);
        
        Flight obj=new Flight(11,"India","America",5,921111.60);
         obj.setFlightId(10);
         obj.setSource("India");
         obj.setDestination("China");
         obj.setNoOfSeats(5);
         obj.setFlightFare(5);
        
        if(a.addFlight(obj)==true){
            System.out.println("Flight details added successfully");
        }
        else{
            System.out.println("Addition not done");
        }
        
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}
