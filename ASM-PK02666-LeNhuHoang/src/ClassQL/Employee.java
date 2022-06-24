/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassQL;

import java.io.Serializable;

/**
 *
 * @author hoang
 */
public class Employee implements Serializable{
    private String id;
    private String name;
    private int age;
    private String email;
    private double salary;
    
    
    
    public Employee(){
        
    }
    
    public Employee(String id, String name, int age, String email, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }
    
    public String getID(){
        return id;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public Double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return this.id + " | " + this.name + " | " + this.age + " | " + this.email + " | " + this.salary;
    }
}
