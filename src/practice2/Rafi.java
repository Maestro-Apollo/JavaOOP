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
public class Rafi extends Person{
    private String eyeColor = "Brown";
    private String skin = "white";

    public Rafi() {
    }

    public Rafi(String aName, int bAge, String aAddress,String eyecolor,String skin) {
        super(aName, bAge, aAddress);
        this.eyeColor = eyecolor;
        this.skin = skin;
    }
    
    
    
}
