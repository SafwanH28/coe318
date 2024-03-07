
package coe318.lab5;

public class test{
private String licensePlate;
private String status;
protected int numWheels;
protected int tankSize;
public test(){System.out.println("In Vehicle's def. constructor");}
public test(String licensePlate){
this.licensePlate=licensePlate;}
public String getPlate(){return licensePlate;}
public void reFuel(){
System.out.println("Override this!");}
public String getStatus(){return status;}
}

