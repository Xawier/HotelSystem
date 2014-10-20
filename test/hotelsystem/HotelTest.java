/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelsystem;

import java.util.Calendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michal
 */
public class HotelTest {
    
    public HotelTest() {
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
     * Test of add method, of class Hotel.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Room room = null;
        Hotel instance = new Hotel();
        instance.add(room);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of room method, of class Hotel.
     */
    @Test
    public void testRoom() {
        System.out.println("room");
        String name = "";
        Hotel instance = new Hotel();
        Room expResult = null;
        Room result = instance.room(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFreeRooms method, of class Hotel.
     */
    @Test
    public void testFindFreeRooms() {
        System.out.println("findFreeRooms");
        Calendar start = null;
        Calendar end = null;
        int n_persons = 0;
        Hotel instance = new Hotel();
        List<QueryResult> expResult = null;
        List<QueryResult> result = instance.findFreeRooms(start, end, n_persons);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
