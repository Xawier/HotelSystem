/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelsystem;

import java.util.Calendar;

/**
 *
 * @author michal
 */
public class Reservation {
    public Calendar start;
    public Calendar end;
    public Person person;
    
    public Reservation(Calendar start, Calendar end, Person person){
        this.start = start;
        this.end = end;
        this.person = person;
    }
    
    Calendar getStart(){
        return this.start;
    }
    
    Calendar getEnd(){
        return this.end;
    }
    
    Person getPerson(){
        return this.person;
    }
}
