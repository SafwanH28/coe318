/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
/**
 *
 * @author Safwan Haque
 */
public class Voltage {
    private double voltage;
    private Node n1;
    private Node n2;
    private int id;
    private static int count =1;
    
    public Voltage(double voltage, Node n1, Node n2){
        this.n1 = n1;
        this.n2 = n2;
        this.voltage = voltage;
        this.id = count;
        count++;
    }
    
    
    public Node[] getNode(){
        Node[] nodes = {n1, n2};
        return nodes;
    }
    
    @Override
    public String toString(){
        return("V"+this.id + " " + this.n1 + " " + this.n2 + " " + "DC " + this.voltage);
    }
}
