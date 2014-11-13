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
import java.util.concurrent.CopyOnWriteArrayList;

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
        List<QueryResult> qr_list = new ArrayList<>();
        CopyOnWriteArrayList<Room> roomsAll = new CopyOnWriteArrayList();
        List<Room> roomsBigger = new ArrayList<>();
        
        // get diff in days between two days //
        Date startDate = start.getTime();
        Date endDate = end.getTime();
        long diff = endDate.getTime() - startDate.getTime();
        int n_days = (int) diff / (1000 * 60 * 60 * 24);
        //end - get diff in days between two days //       

        
        for(Room room: this.roomsList){
            if(!room.isReserved(start, end)){
                roomsAll.add(room);
            }
        }
                
        //pokoje wieksze od potrzebnych//
        for(Room room: roomsAll){
            
            if(room.n_persons >= n_persons){
                roomsBigger.add(room);
                QueryResult tmpRes = new QueryResult();
                tmpRes.add(room, room.price);
                qr_list.add(tmpRes);
                
                roomsAll.remove(room);
            }
        }
        //end-pokoje wieksze od potrzebnych//
   
        while(roomsAll.size() > 0){
            List<Room> nextComb = new ArrayList<>(roomsAll);
 
            List<Room> tempComb = new ArrayList<>();
            tempComb.add(roomsAll.get(0));
            
            while(nextComb.size()-1 > 0){
                tempComb.add(nextComb.get(nextComb.size()-1));
                
                if(this.isEnoughRooms(tempComb, n_persons)){
                    List<Room> tmp = new ArrayList<>(tempComb);
                    QueryResult tmpRes = new QueryResult();
                    
                    for(Room room: tmp){
                        tmpRes.price += room.price;
                    }
                    
                    tmpRes.rooms = tmp;
                    qr_list.add(tmpRes);
                    
                    tempComb.clear();
                    tempComb.add(nextComb.get(0));
                }
                nextComb.remove(nextComb.size()-1);
            }
            roomsAll.remove(roomsAll.get(0));
            nextComb = roomsAll;   
        }

        return qr_list;
    }

    List<QueryResult> findTheCheapestRooms(List<QueryResult> list){
        int cheapestTMP;
        int i = list.size()-1;
        while(i > 0){
            cheapestTMP = list.get(i).price;            
            if(cheapestTMP > list.get(i-1).price){
                list.remove(list.get(i));
            }
            i=i-1;
        }
        return list;
    }
    
    boolean isEnoughRooms(List<Room> x, int n){
        int i=0;
        for(Room room: x){
            i += room.n_persons;
        }
        
        if(i >= n){
            return true;
        }else{
            return false;
        }
    }
    
    void reserve(Calendar start, Calendar end, QueryResult result, Person person){
        List<Room> rooms = result.rooms();
        
        for(Room room: rooms){
            room.setReservation(start, end, person);
        }
    }
}