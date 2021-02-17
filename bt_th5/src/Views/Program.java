package Views;

import Behaviors.FamilyManagement;
import Behaviors.Methods;
import Entities.Family;
import Entities.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        FamilyManagement fm = new FamilyManagement();
        Scanner s = new Scanner(System.in);
        start:
        do {
            System.out.println(" 1 . Person");
            System.out.println(" 2 . Family");
            int choice1 = Integer.parseInt(s.nextLine());
            switch (choice1){
                case 1 :
                    do {
                        System.out.println("1.Add");
                        System.out.println("2.Delete ");
                        System.out.println("3. Search");
                        System.out.println("4. Show");
                        System.out.println("5 . Update");
                        System.out.println("6. Back");
                        int choice = Integer.parseInt(s.nextLine());
                        switch (choice){
                            case 1 :
                                Person p = Menus.getPersonInfo();
                                m.add(p);
                                break;
                            case 2 :
                                System.out.println(" Id ? ");
                                int id = Integer.parseInt(s.nextLine());
                                m.delete(id);
                                break;
                            case 3 :
                                System.out.println(" Id ? ");
                                int id1 = Integer.parseInt(s.nextLine());
                                System.out.println(m.search(id1));
                                break;
                            case 4 :
                                m.showAll();
                                break;
                            case 5 :
                                Person p1 = Menus.getPersonInfo();
                                m.update(p1);
                                break;
                            case 6 :
                                continue start;
                        }
                    }
                    while(true);
                case 2 :
                    do {
                        System.out.println("1.Add");
                        System.out.println("2.Delete ");
                        System.out.println("3. Search");
                        System.out.println("4. Show");
                        System.out.println("5 . Update");
                        System.out.println("6. Back");
                        int choice = Integer.parseInt(s.nextLine());
                        switch (choice){
                            case 1 :
                                ArrayList<Person> persons = new ArrayList<>();
                                Family f = Menus.getFamilyInfo();
                                for (int i = 0; i < f.getNumberPeople(); i++) {
                                    System.out.println("Enter People Id That You Want To Add");
                                    int id = Integer.parseInt(s.nextLine());
                                    Person person = m.search(id);
                                    persons.add(person);
                                }
                                f.setPersons(persons);
                                fm.add(f);
                                break;
                            case 2 :
                                System.out.println(" Id ? ");
                                int id = Integer.parseInt(s.nextLine());
                                fm.delete(id);
                                break;
                            case 3 :
                                System.out.println(" Id ? ");
                                int id1 = Integer.parseInt(s.nextLine());
                                System.out.println(fm.search(id1));
                                break;
                            case 4 :
                                fm.showAll();
                                break;
                            case 5 :
                                Person p = Menus.getPersonInfo();
                                System.out.println("Id ?");
                                int id2 = Integer.parseInt(s.nextLine());
                                fm.update(id2,p);
                                break;
                            case 6 :
                                continue start;
                        }
                    }
                    while(true);

            }


        }while (true);
    }
}
