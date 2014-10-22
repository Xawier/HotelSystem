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
    public int price;
    
    public QueryResult(){
        this.rooms = new ArrayList<>();
        this.price = 0;
    }
    
    public void add(Room room, int price){
        this.rooms.add(room);
        this.price = price;
    }
    
    List<Room> rooms(){
        return this.rooms;
    }
    
    public int price(){
        return this.price;
    }
}