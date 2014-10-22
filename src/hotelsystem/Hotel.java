/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
        
        // get diff in days between two days //
        Date startDate = start.getTime();
        Date endDate = end.getTime();
        long diff = endDate.getTime() - startDate.getTime();
        int n_days = (int) diff / (1000 * 60 * 60 * 24);
        
        
        for(Room room: roomsList){
            if(room.n_persons == n_persons){
                QueryResult qr = new QueryResult();
                qr.add(room, room.price()*n_days);
                
                result.add(qr);
            }
        }
        
        return result;
    }
}