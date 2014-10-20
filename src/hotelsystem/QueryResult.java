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
    List<Room> rooms;
    
    public QueryResult(){
        this.rooms = new ArrayList<>();
    }
    
    List<Room> rooms(){
        return this.rooms;
    }
}
