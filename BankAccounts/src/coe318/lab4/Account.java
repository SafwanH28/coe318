/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author Your Name
 */
public class Account {

    private String accName;
    private int accNum;
    private double accBal;

    public Account(String name, int number, double initialBalance) {
        accName = name;
        accNum = number;
        accBal = initialBalance;

    }

    public String getName() {
        return (accName);
    }

    public int getNumber() {
        return (accNum);
    }

    public double getBalance() {
        return (accBal);
    }

    public boolean withdraw(double amount) {
        if (amount <= accBal && amount > 0) {
            accBal = accBal - amount;
            return (true);
        }
        return (false);

    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            accBal = accBal + amount;
            return (true);
        }
        return (false);

    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return this.accName + "\t" + String.valueOf(this.accNum) + "\t" + String.valueOf(this.accBal);
    }
}
