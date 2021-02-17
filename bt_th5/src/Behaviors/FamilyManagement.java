package Behaviors;

import Entities.Family;
import Entities.Person;

import java.awt.*;
import java.net.FileNameMap;
import java.util.ArrayList;

public class FamilyManagement {
    ArrayList<Family> families = new ArrayList<>();
    public void add (Family f){
        families.add(f);
    }
    public void delete(int id ){
        families.removeIf(f -> f.getId() == id);
    }
    public Family search(int id ){
        for ( Family f : families){
            if (f.getId() == id ){
                return f;
            }
        }return null;
    }
    public void showAll(){
        for (Family f : families){
            System.out.println(f);
        }
    }
    public void update (int id, Person p){
        for (Family f : families){
            if (f.getId() == id ){
                for ( Person p1 : f.getPersons()){
                    if (p1.getId() == p.getId()){
                        p1.setName(p.getName());
                        p1.setBirthDay(p.getBirthDay());
                        p1.setJob(p.getJob());
                    }
                }
            }
        }
    }
}
