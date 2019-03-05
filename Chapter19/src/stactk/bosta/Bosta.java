/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stactk.bosta;

/**
 *
 * @author User
 */
public class Bosta {
    private final int serial;
    private final String weight;
    
    public Bosta(int serial, String weight){
    this.serial= serial;
    this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bosta{" + "serial=" + serial + ", weight=" + weight + '}';
    }
    
}
