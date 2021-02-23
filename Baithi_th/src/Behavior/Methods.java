package Behavior;

import Entities.Phonebook;

import java.util.ArrayList;

public class Methods {
    private static final String PATH_FILE = "C:\\Users\\user\\Desktop\\MODULE-2\\Baithi_th\\src\\phoneBook.csv" ;
    ArrayList<Phonebook> phonebooks = new ArrayList<>();
    public void show(){
        for (Phonebook p : phonebooks){
            System.out.println(p.toString());
        }
    }
    public void add (Phonebook p){
        phonebooks.add(p);
        ReadWriteFile.writeToFileCsv(phonebooks,PATH_FILE);
    }
    public void update(Phonebook p){
        for (Phonebook phonebook : phonebooks){
            if (p.getId() == phonebook.getId()){
                phonebook.setName(p.getName());
                phonebook.setAddress(p.getAddress());
                phonebook.setEmail(p.getEmail());
                phonebook.setFaceBook(p.getFaceBook());
                phonebook.setNumberPhone(p.getNumberPhone());
            }
        }ReadWriteFile.writeToFileCsv(phonebooks,PATH_FILE);
    }
    public void delete(int id ){
        phonebooks.removeIf(p -> p.getId() == id);
        ReadWriteFile.writeToFileCsv(phonebooks,PATH_FILE);
    }
    public void search(int id){
        for (Phonebook p : phonebooks){
            if (p.getId()== id){
                System.out.println(p.toString());
            }
        }
    }
}
