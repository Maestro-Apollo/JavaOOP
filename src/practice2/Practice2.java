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
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person object1 = new Person("Rafi",24,"Mirpur");
        Person object2 = new Person("Noyon",24,"Savar");
        Person object3 = new Person("Noyon",24,"Savar");
        System.out.println(object3.counta);
        
        obj1.Range(290);
        System.out.println("Your salary: "+obj1.getRange());
        
        
        
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person obj4 = new Person();
        Person obj5 = new Person();
        System.out.println(obj5.count);
        
        System.out.println(Person.showVoice());
        
        
        Rafi obje1 = new Rafi("Leo",24,"Mirpur","black","white");
        System.out.println(obje1.getName());
        System.out.println(obje1.getAge());

        // TODO code application logic here
    }
    
}
