import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static Student getStudent(String flag) {
        Student s = null;
        if (flag == "add") {
            s = new Student();
            System.out.print("Enter id student:");
            s.setId(Integer.parseInt(input.nextLine()));
            System.out.println("Emter name student");
            s.setName(input.nextLine());
        } else if (flag == " update") {

        }
        return s;
    }
}