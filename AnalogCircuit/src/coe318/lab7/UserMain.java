package coe318.lab7;

import java.util.*;

/**
 *
 * @author Safwan Haque
 */
public class UserMain implements UserInterface {

    String input = "";
    ArrayList<Object> element = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    @Override
    public void start() {
        display();
        run();
    }
    
    @Override
    public void run() {
        while (true) {
            input = scan.nextLine().trim();

            if (input.equalsIgnoreCase("end")) {
                end();
                break;
            } else if (input.equalsIgnoreCase("spice")) {
                spice();
            } else {
                String[] value = input.split(" ");

                if (value.length != 4) {
                    System.out.println("\nThere seems to be an issue with your input. \nPlease try again");
                } else {
                    if (input.toLowerCase().startsWith("v")) {
                        double volt;

                        Node n1 = new Node();
                        Node n2 = new Node();

                        n1.id = Integer.parseInt(value[1]);
                        n2.id = Integer.parseInt(value[2]);

                        volt = Double.parseDouble(value[3]);
                        Voltage v = new Voltage(volt, n1, n2);

                        element.add(v);
                    } else if (input.toLowerCase().startsWith("r")) {
                        double res;

                        Node n1 = new Node();
                        Node n2 = new Node();

                        n1.id = Integer.parseInt(value[1]);
                        n2.id = Integer.parseInt(value[2]);

                        res = Double.parseDouble(value[3]);
                        Resistor r = new Resistor(res, n1, n2);

                        element.add(r);
                    }
                }
            }
        }
    }

    @Override
    public void display() {
        String A = ("Enter your input:"); 
        System.out.println(A);
    }
    

    @Override
    public void spice() {
        for (Object o : element) {
            System.out.println(o);
        }
    }

    @Override
    public void end() {
        System.out.println("All Done");
    }

    public static void main(String[] args) {
        UserMain m = new UserMain();
        m.start();
    }
}

