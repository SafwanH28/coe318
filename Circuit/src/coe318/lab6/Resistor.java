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
public class Resistor {

    int resistorId;
    double rvalue;
    static int resistorIdNext = 1;
    Node a, b;

    public Resistor(double resistance, Node node1, Node node2) {
        if (resistance < 0 || resistance == 0) {
            throw new IllegalArgumentException("Resitance can't be 0 or negative");
        }
        if (node1 == null || node2 == null) {
            throw new IllegalArgumentException("Node can't be null");
        }
        resistorId = resistorIdNext;
        resistorIdNext++;
        rvalue = resistance;
        a = node1;
        b = node2;

    }

    public Node[] getNodes() {
        Node[] nodes = {a, b};
        return nodes;
    
    
    
    }
    @Override
    public String toString() {
        return "R" + resistorId + " " + this.getNodes()[0] + this.getNodes()[1] + " " + rvalue;

    }
}
