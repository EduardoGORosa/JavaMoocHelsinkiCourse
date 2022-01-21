import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<Person>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = this.persons.get(0);
        for(Person compare: persons){
            if(compare.getHeight() < shortest.getHeight()){
                shortest = compare;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = shortest();
        persons.remove(persons.indexOf(shortest));
        return shortest;
    }
}
