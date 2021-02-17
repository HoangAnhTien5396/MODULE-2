package Views;

import Entities.Family;
import Entities.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);
    public static Person getPersonInfo(){
        System.out.println("Id ?");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Name ?");
        String name = input.nextLine();
        System.out.println("birthDay ?");
        String birthDay = input.nextLine();
        System.out.println("Job ?");
        String job = input.nextLine();
        return new Person(id,name,birthDay,job);
    }
    public static Family getFamilyInfo(){
        System.out.println("Id ?");
        int id = Integer.parseInt(input.nextLine());
        System.out.println(" numberPeople ?");
        int numberPeople = Integer.parseInt(input.nextLine());
        System.out.println(" numberHouse ?");
        int numberHouse = Integer.parseInt(input.nextLine());
        return new Family(id,numberPeople,numberHouse,null);
    }
}
