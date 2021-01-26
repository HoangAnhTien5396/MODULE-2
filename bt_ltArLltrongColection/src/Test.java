import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager p = new ProductManager();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Update");
            System.out.println("4.Show");
            System.out.println("5.Sort");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Product a = new Product();
                    System.out.println("Id");
                    a.setId(input.nextInt());
                    System.out.println("Name");
                    input.nextLine();
                    a.setName(input.nextLine());
                    System.out.println("Money");
                    a.setMoney(input.nextInt());
                    p.add(a);
                    break;
                case 2:
                    System.out.println("Enter id student");
                    int id = input.nextInt();
                    p.delete(id);
                    break;
                case 3:
                    Product a1 = new Product();
                    System.out.println("Id");
                    a1.setId(input.nextInt());
                    System.out.println("Name Update");
                    input.nextLine();
                    a1.setName(input.nextLine());
                    p.update(a1);
                    break;
                case 4:
                    p.showAll();
                    break;
                case 5 :
                    p.sortByPrice();
            }
        } while (true);
    }
}
