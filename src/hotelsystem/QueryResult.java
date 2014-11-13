/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateusz
 */
public class QueryResult {
    public List<Room> rooms;
    //public List<List<Room>> combRooms;
    public int price;
    
    public QueryResult(){
        this.rooms = new ArrayList<>();
        //this.combRooms = new ArrayList<List<Room>>();
        this.price = 0;
    }
    
    public void add(Room room, int price){
        this.rooms.add(room);
        this.price = price;
    }
    /*
    public void addListRooms(List<Room> rooms){
        this.combRooms.add(rooms);
    }
    */
    List<Room> rooms(){
        return this.rooms;
    }
    
    public int price(){
        return this.price;
    }
    
    public int countPersonsInRoom(){
        int i = 0;
        for(Room room: this.rooms){
            i += room.n_persons;
        }
        
        return i;
    }
}