package coe318.lab7;
import java.util.*;
/**
 *
 * @author Safwan Haque
 */
public class Circuit {
    public ArrayList<Resistor> resistors = new ArrayList<Resistor>();
    public ArrayList<Voltage> voltagesource = new ArrayList<Voltage>();
     
    
    public void addr(Resistor r){
       resistors.add(r); 
    }
    
    public void addv(Voltage v){
        voltagesource.add(v);
    }

    private static Circuit instance = null;
    
    public static Circuit getInstance(){
        if(instance == null)
            instance = new Circuit();
        return instance;
    }
    
    private Circuit() {}  

    public String toString(){
       String result1= "";
       String result= "";
       int i=0;
       
       while(i<voltagesource.size() || i<resistors.size()){
           if(i<voltagesource.size())
               result += voltagesource.get(i);
           
           if(i<resistors.size())
               result1 += resistors.get(i);

           i++;
       }   
       return result+result1;
   }
}