import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Add");
            System.out.println("2: Delete");
            System.out.println("3: Update");
            System.out.println("4: Show");
            int choice =Integer.parseInt( input.nextLine());
            switch (choice){
                case 1:
                    Student s = Menus.getStudent("add");
                    m.add(s);
                    break;
                case 2:
                    System.out.print("Enter id student:");
                    int id = Integer.parseInt( input.nextLine());
                    m.delete(id);
                    break;
                case 3:
                    Student s2 = Menus.getStudent("update");
                    m.update(s2);
                    break;
                case 4:
                    m.showAll();
                    break;
            }
        }while (true);
    }
}