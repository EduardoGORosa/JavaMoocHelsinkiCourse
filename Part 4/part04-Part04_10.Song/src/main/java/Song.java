/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class Song {
    private String name;
    private int lenght;
    
    public Song(String name, int length){
        this.lenght = length;
        this.name = name;
    }
    
    public String name(){
        return name;
    }
    
    public int length(){
        return lenght;
    }
}
