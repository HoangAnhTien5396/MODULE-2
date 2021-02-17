package Behaviors;

import Entities.Person;

import java.util.ArrayList;

public class Methods {
    ArrayList<Person> persons = new ArrayList<>();
    public void add(Person p){
        persons.add(p);
    }
    public void delete (int id) {
        persons.removeIf(p -> p.getId() == id);
    }
    public void update(Person p ){
        for(Person p1 : persons){
            if (p1.getId() == p.getId()){
                p1.setName(p.getName());
                p1.setBirthDay(p.getBirthDay());
                p1.setJob(p.getJob());
            }
        }
    }
    public Person search(int id){
        for (Person p : persons){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public void showAll(){
        for (Person p : persons){
            System.out.println(p);
        }
    }
}
