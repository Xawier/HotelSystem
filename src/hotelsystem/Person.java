package hotelsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michal
 */
public class Person {
    private String first_name;
    private String name;
    private String email;
    private String address;
    
    public Person(String first_name, String name, String email, String address){
        this.address = address;
        this.email = email;
        this.first_name = first_name;
        this.name = name;
    }
    
    String getFirstName(){
        return this.first_name;
    }
    
    String getName(){
        return this.name;
    }
    
    String getEmail(){
        return this.email;
    }
    
    String getAddress(){
        return this.address;
    }
}
