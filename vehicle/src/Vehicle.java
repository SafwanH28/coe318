public class Vehicle{
private String licensePlate;
private String status;
protected int numWheels;
protected int tankSize;
public Vehicle(){System.out.println("In Vehicle's def. constructor");}
public Vehicle(String licensePlate){
this.licensePlate=licensePlate;}
public String getPlate(){return licensePlate;}
public void reFuel(){
System.out.println("Override this!");}
public String getStatus(){return status;}


public static void main (String[] args){
Vehicle v= new Vehicle("ABC");
Car c= new Car("GHI");
System.out.println(c.getPlate());
}

}



