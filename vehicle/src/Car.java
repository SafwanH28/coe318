
public class Car extends Vehicle{
public Car(String licensePlate){
numWheels=4;
tankSize=65;
}
@Override
public void reFuel(){
System.out.println("Fuel must be gasoline");}
}

