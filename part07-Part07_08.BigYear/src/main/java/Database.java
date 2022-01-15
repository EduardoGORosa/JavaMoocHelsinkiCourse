/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author dudug
 */
public class Database {
    private ArrayList<Bird> birds;
 
    public Database() {
        this.birds = new ArrayList<>();
    }
 
    public boolean observation(String name) {
        for (Bird bird : birds) {
            if (bird.name().equals(name)) {
                bird.observation();
                return true;
            }
        }
        return false;
    }
 
    public void add(String name, String nameInLatin) {
        this.birds.add(new Bird(name, nameInLatin));
    }
 
    public String oneBird(String name) {
        for (Bird bird : birds) {
            if (bird.name().equals(name)) {
                return bird.toString();
            }
        }
        return null;
    }
 
    public String allBirds() {
        String allBirds = "";
        for (Bird bird : birds) {
            allBirds += bird.toString();
        }
        return allBirds;
    }
}
