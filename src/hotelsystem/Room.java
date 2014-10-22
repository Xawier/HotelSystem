/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

/**
 *
 * @author Mateusz
 */
public class Room {
    public String name;
    public int n_persons;
    
    public Room(String name, int n_persons){
        this.name = name;
        this.n_persons = n_persons;
    }
    
    String name(){
        return this.name;
    }
    
    int n_persons(){
        return this.n_persons;
    }
}
