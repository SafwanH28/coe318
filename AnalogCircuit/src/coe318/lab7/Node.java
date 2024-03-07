package coe318.lab7;
/**
 *
 * @author Safwan Haque
 */
public class Node {
    public int id;
    public static int next = 0;
    
    public Node(){
        this.id = next;
        next++;
    }
    
    public String toString(){
        return " " + this.id;
    }
}
