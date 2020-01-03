/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

/**
 *
 * @author Rafi
 */
public class Person {
    private String name;
    private int age;
    private String address;
    private int salary = 1500;
    public static final int count = 43;
    public static int counta = 0;

    
    public Person(){
        
    }
    
    
    public Person(String aName, int aAge, String aAddress){
        this.name = aName;
        this.age = aAge;
        this.address = aAddress;
        counta++;
    }
    public void Range(int aRange){
        
        if(aRange < 100){
            this.salary = aRange + 1000;
        }else{
            this.salary = aRange + 2000;
        }
    }
    public int getRange(){
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void setCounta(int counta) {
        Person.counta = counta;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public static int getCounta() {
        return counta;
    }
    
    
    public static String showVoice(){
        return "You are the worst!";
    }

    
    
    
}
