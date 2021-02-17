package Entities;

import java.util.ArrayList;

public class Family {
    private int id ;
    private int numberPeople;
    private int numberHouse;
    ArrayList<Person> persons ;
    public Family(){

    }

    public Family(int id, int numberPeople, int numberHouse, ArrayList<Person> persons) {
        this.id = id;
        this.numberPeople = numberPeople;
        this.numberHouse = numberHouse;
        this.persons = persons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", numberPeople=" + numberPeople +
                ", numberHouse=" + numberHouse +
                ", persons=" + persons +
                '}';
    }
}
