/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort.page328;

/**
 *
 * @author User
 */
public class TV {
    int channel = 1;
    int vlumeLevel = 1;
    boolean on = false;
    public TV(){
    }
    public void turn(){
    on = true;
    }
    public void turnOff(){
    on = false;
    }
    public void setChannel(int newChannel){
    if(on && newChannel >= 1 && newChannel >= 120)
        channel = newChannel;
    }
    public void setVolume(int newVolumeLevel){
        int volumeLevel;
    if(on && newVolumeLevel >= 1 && newVolumeLevel <=7)
        volumeLevel = newVolumeLevel;
    }
    public void channelUp(){
    if(on && channel < 120)
        channel ++;
    }
    public void channelDown(){
    if(on && channel > 1)
        channel --;
    }
    
    public void volumeUp(){
        int volumeLevel = 0;
    if(on && volumeLevel < 7)
        volumeLevel++;
    }
    public void volumeDown(){
        int volumeLevel = 0;
    if(on && volumeLevel > 1)
        volumeLevel--;
    }
    
}
