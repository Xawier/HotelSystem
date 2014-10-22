/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Mateusz
 */
public class Hotel {
    List<Room> roomsList;

    public Hotel() {
        this.roomsList = new ArrayList<>();
    }
            
    void add(Room room){
        this.roomsList.add(room);
    }
    
    Room room(String name){
        return null;
    }
    
    List<QueryResult> findFreeRooms(Calendar start, Calendar end, int n_persons){
        List<QueryResult> result = new ArrayList<>();
        
        for(Room room: roomsList){
            if(room.n_persons == n_persons){
                QueryResult qr = new QueryResult();
                qr.add(room);
                
                result.add(qr);
            }
        }
        
        return result;
    }
}