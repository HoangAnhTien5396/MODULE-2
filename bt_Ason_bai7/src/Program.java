import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Add");
            System.out.println("2: Payroll");
            System.out.println("3: Show8");
            System.out.println("4: Show");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    teacherStaff t = Menus.getTeacherStaff("Add");
                    m.add(t);
                    break;
                case 2 :
                    System.out.print("Enter id teacherStaff:");
                    int id = Integer.parseInt( input.nextLine());
                    m.Payroll(id);
                    break;
                case 3 :
                    m.showInformation8();
                    break;
                case 4:
                    m.showInformation();
                    break;
            }
        }while (true);
    }
}
