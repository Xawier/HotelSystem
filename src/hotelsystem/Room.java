/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mateusz
 */
public class Room {
    public String name;
    public int n_persons;
    public int price;
    public Reservation reservation;
    
    public Room(String name, int n_persons, int price){
        this.name = name;
        this.n_persons = n_persons;
        this.price = price;
    }
    
    String name(){
        return this.name;
    }
    
    int n_persons(){
        return this.n_persons;
    }
    
    int price(){
        return this.price;
    }
    
    void setReservation(Calendar start, Calendar end, Person person){
        Reservation r = new Reservation(start,end,person);
        this.reservation = r;
    }
    
    boolean isReserved(Calendar start, Calendar end){
        Date startDate = start.getTime();
        Date endDate = end.getTime();
        Date sd;
        Date ed;
        try{
            sd = this.reservation.start.getTime();
            ed = this.reservation.end.getTime();
        }catch(NullPointerException e){
            return false;
        }

        return !startDate.before(sd) && !endDate.after(ed);
    }
}
