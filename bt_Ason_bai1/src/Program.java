import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Show");
            System.out.println("4.Bill");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    People p = Menus.getPeople("Add");
                    m.add(p);
                    break;
                case 2:
                    System.out.print("Enter id People:");
                    int id = Integer.parseInt(input.nextLine());
                    m.delete(id);
                    break;
                case 3:
                    m.show();
                    break;
                case 4:
                    System.out.print("Enter id People:");
                    int id1 = input.nextInt();
                    m.Bill(id1);
                    break;
            }
        } while (true);
    }
}
