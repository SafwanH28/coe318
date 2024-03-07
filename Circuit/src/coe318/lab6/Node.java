/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Haque
 */
public class Node {

    int id;
    static int idNext = 0;

    public Node() {
        id = idNext;
        idNext++;
    }

    @Override
    public String toString() {
        return " " + id;
    }
}
