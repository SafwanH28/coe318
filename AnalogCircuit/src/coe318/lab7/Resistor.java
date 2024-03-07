package coe318.lab7;

/**
 *
 * @author Safwan Haque
 */
public class Resistor {

    public double resistance;
    public Node n1, n2;
    public int resid;
    private static int count = 1;

    public Resistor(double resistance, Node n1, Node n2) {
        if (resistance < 0) {
            throw new IllegalArgumentException("Resitances value can not be less than 0.");
        }

        if (n1 == null || n2 == null) {
            throw new IllegalArgumentException("The connecting nodes must both exist. (Null Error)");
        }

        this.resistance = resistance;
        this.n1 = n1;
        this.n2 = n2;
        this.resid = count;
        count++;
    }

    public Node[] getNode() {
        Node[] nodes = {n1, n2};
        return nodes;
    }

    @Override
    public String toString() {
        return ("R" + resid + " " + n1 + " " + n2 + " " + resistance);
    }
}
