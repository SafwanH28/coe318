/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe318.lab7;

import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Haque
 */
public class ResistorTest {

    public ResistorTest() {
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
     * Test of getNode method, of class Resistor.
     */
    @Test
    public void testGetNode() {
        System.out.println("getNode");
        double res;

        Node n1 = new Node();
        Node n2 = new Node();

        n1.id = Integer.parseInt("1");
        n2.id = Integer.parseInt("2");

        res = Double.parseDouble("3.0");
        Resistor r = new Resistor(res, n1, n2);
        Node[] result = r.getNode();
        Node[] expected = {n1, n2};
        assertEquals(expected[0].toString(), result[0].toString());
        assertEquals(expected[1].toString(), result[1].toString());
        assertEquals(2, result.length);
    }

    /**
     * Test of toString method, of class Resistor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        double res;

        Node n1 = new Node();
        Node n2 = new Node();

        n1.id = Integer.parseInt("1");
        n2.id = Integer.parseInt("2");

        res = Double.parseDouble("3.0");
        Resistor r = new Resistor(res, n1, n2);
        assertEquals("R1  1  2 3.0", r.toString());
    }
}
