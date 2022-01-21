import java.util.ArrayList;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class JokeManager {
    private ArrayList<String> jokeslist;
    
    public JokeManager(){
        this.jokeslist = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokeslist.add(joke);
    }
    
    public String drawJoke(){
        if(jokeslist.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        return jokeslist.get(draw.nextInt(this.jokeslist.size()));
    }
    
    public void printJokes(){
        for(String joke: this.jokeslist){
            System.out.println(joke);
        }
    }
}
