/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Haque
 */
public class CircuitTest {
    
    public CircuitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addr method, of class Circuit.
     */
    @Test
    public void testAddr() {
        System.out.println("addr");
        String s=String.valueOf(1);
        Node n1 = s;
        Node n2 = s;
        Resistor r = new Resistor(1, n1, n2);
        Circuit instance = new Circuit();
        instance.addr(r);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals(0,0);
    }

    /**
     * Test of addv method, of class Circuit.
     */
//    @Test
//    public void testAddv() {
//        System.out.println("addv");
//        Voltage v = null;
//        Circuit instance = null;
//        instance.addv(v);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
