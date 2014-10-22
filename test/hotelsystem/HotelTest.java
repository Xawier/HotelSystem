/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelsystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
     * Test of room method, of class Hotel.
     *
    @Test
    public void testRoom() {
        System.out.println("room");
        String name = "";
        Hotel instance = new Hotel();
        Room expResult = null;
        Room result = instance.room(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
    @Test
    public void testFindFreeRoomsIfEmpty(){
        System.out.println("If empty findFreeRooms shoud return empty");
        Calendar start = new GregorianCalendar(2014, 8, 12);
        Calendar end = new GregorianCalendar(2014, 8, 15);
        int n_persons = 2;
        
        Hotel instance = new Hotel();
        List<QueryResult> expRes = new ArrayList<>();
        List<QueryResult> result = instance.findFreeRooms(start, end, n_persons);
        
        assertEquals(expRes, result);
    }
}