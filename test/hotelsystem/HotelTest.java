/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelsystem;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println("If empty findFreeRooms() shoud return empty");
        Calendar start = new GregorianCalendar(2014, 8, 12);
        Calendar end = new GregorianCalendar(2014, 8, 15);
        int n_persons = 2;
        
        Hotel instance = new Hotel();
        List<QueryResult> expRes = new ArrayList<>();
        List<QueryResult> result = instance.findFreeRooms(start, end, n_persons);
        
        assertEquals(expRes, result);
    }
    /*
    @Test
    public void testFindFreeRoomsIfOneRoom(){
       System.out.println("If one room findFreeRooms() shoud return one element's array");
       Calendar start = new GregorianCalendar(2014, 8, 12);
       Calendar end = new GregorianCalendar(2014, 8, 15);
       int n_persons = 2;
       
       Hotel hotel = new Hotel();
       Room room = new Room("dwojka", 2, 0);
       hotel.add(room);
       
       List<QueryResult> result = hotel.findFreeRooms(start, end, n_persons);
       assertEquals(1, result.size());
    }
    
    @Test
    public void testFindFreeRoomsIfOneRoomWithPrice(){
        System.out.println("If room with price 180 findFreeRooms() shoud return 180*n_days price");
        Calendar start = new GregorianCalendar(2014, 8, 12);
        Calendar end = new GregorianCalendar(2014, 8, 15);
        int n_persons = 2;
        int n_days = 3;
        
        Hotel hotel = new Hotel();
        Room room = new Room("dwojka", 2, 180);
        hotel.add(room);
        
        List<QueryResult> result = hotel.findFreeRooms(start, end, n_persons);
        assertEquals(180*n_days, result.get(0).price());
    }
<<<<<<< HEAD
    */

    @Test
    public void testFindFreeRoomsIfTwoDifferentRooms(){
        System.out.println("If four rooms (1-1, 2-2, 4-1) findFreeRooms() shoud return a ist of three possible results sorted according to price in increasing order");
        Calendar start = new GregorianCalendar(2014, 8, 12);
        Calendar end = new GregorianCalendar(2014, 8, 13);

        int n_persons = 3;

                
        Hotel hotel = new Hotel();
        Room room1 = new Room("jedynka", 1, 120);
        Room room21 = new Room("dwojka1", 2, 180);
        Room room22 = new Room("dwojka2", 2, 180);
        Room room3 = new Room("czworka", 4, 300);
        
        hotel.add(room1);
        hotel.add(room21);
        hotel.add(room22);
        hotel.add(room3);

        List<QueryResult> result = hotel.findFreeRooms(start, end, n_persons);
        assertEquals(4, result.size());
    }
    
    @Test
    public void testReserve(){
        System.out.println("Test reseve method");
        Calendar start1 = new GregorianCalendar(2014, 8, 11);
        Calendar end2 = new GregorianCalendar(2014, 8, 12);
        Calendar start = new GregorianCalendar(2014, 8, 10);
        Calendar end = new GregorianCalendar(2014, 8, 13);
        Person person = new Person("Michal", "Stachowicz", "m.stachowicz@uj.edu.pl", "jakis adres 9a");
    
        Hotel hotel = new Hotel();
        List<Room> list_room = new ArrayList();
        QueryResult qr = new QueryResult();
        Room room1 = new Room("jedynka", 1, 120);
        hotel.add(room1);
        list_room.add(room1);
        qr.rooms = list_room;
        
        hotel.reserve(start, end, qr, person);
        assertEquals(true, room1.isReserved(start1, end2));
    }
    
    @Test
    public void testCheapestFindRooms(){
        System.out.println("Find the cheapest rooms");
        
        Calendar start = new GregorianCalendar(2014, 8, 12);
        Calendar end = new GregorianCalendar(2014, 8, 13);
        int n_persons = 3;
        
        Hotel hotel = new Hotel();
        Room room1 = new Room("jedynka", 1, 120);
        Room room21 = new Room("dwojka1", 2, 180);
        Room room22 = new Room("dwojka2", 2, 180);
        Room room3 = new Room("czworka", 4, 300);
        
        hotel.add(room1);
        hotel.add(room21);
        hotel.add(room22);
        hotel.add(room3);
        
        List<QueryResult> result = hotel.findFreeRooms(start, end, n_persons);
        List<QueryResult> r = hotel.findTheCheapestRooms(result);

        assertEquals(3, r.size());
        assertEquals(300, r.get(0).price());
        assertEquals(300, r.get(1).price());
        assertEquals(300, r.get(2).price());
    }
}

