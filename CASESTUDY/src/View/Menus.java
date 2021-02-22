package View;

import Entities.Customer;
import Entities.Service;

import java.util.Scanner;

public class Menus {
    static Scanner s = new Scanner(System.in);
    public static Customer getInfoCustomer(){
        System.out.println("1.Nhập Id ");
        int id = Integer.parseInt(s.nextLine());
        System.out.println("2.Nhập Name");
        String name = s.nextLine();
        System.out.println("3.Nhập Tuổi");
        int age = Integer.parseInt(s.nextLine());
        return new Customer(id,name,age);
    }
    public static Service getInfoService(){
        System.out.println("Nhập tên sản phẩm ");
        System.out.println("1.Coca ");
        System.out.println("2.Pepsi ");
        System.out.println("3.Bimbim ");
        System.out.println("4.Juice ");
        System.out.println("5.Beer");
        System.out.println("6.Vịn");
        int choice = Integer.parseInt(s.nextLine());
        switch (choice){
            case 1 :
                return new Service("Coca",15000);
            case 2 :
                return new Service("Pepsi", 15000);
            case 3 :
                return new Service("Bimbim", 10000);
            case 4:
                return new Service("Juice", 60000);
            case 5 :
                return new Service("Beer", 20000);
            case 6 :
                return new Service("Vịn",300000);
            default:
                return new Service(null,0);
        }
    }
}
