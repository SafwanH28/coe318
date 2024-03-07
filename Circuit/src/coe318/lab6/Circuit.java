/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author Haque
 */
public class Circuit {

    public static ArrayList<Resistor> allResistors;

    private static Circuit instance = null;

    public static Circuit
            getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    private Circuit() {
        allResistors = new ArrayList<Resistor>();

    } //Yes, the constructor is PRIVATE!

    public void add(Resistor r) {
        allResistors.add(r);
    }

    @Override
    public String toString() {
        String circuit = new String();

        for (int i = 0; i < allResistors.size(); i++) 
        {
            circuit += allResistors.get(i).toString() + "\n";
        }
        return (circuit);
    }

    public static void main(String[] args) {

        Circuit c1 = Circuit.getInstance();

        Node A = new Node();
        Node B = new Node();
        Node C = new Node();

        System.out.println("Resistor ID " + A.toString());
        System.out.println("Resistor ID " + B.toString());
        System.out.println("Resistor ID " + C.toString());

        Resistor r1 = new Resistor(50, A, B);
        Resistor r2 = new Resistor(15, B, C);
        
        System.out.println("\n");

        c1.add(r1);
        c1.add(r2);

        System.out.println(c1.toString());
    }
}
