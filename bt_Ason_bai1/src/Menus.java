import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static People getPeople(String flag) {
        People people = null;
        if (flag.equals("Add")) {
            people = new People();
            System.out.print("Enter idCard People:");
            people.setIdCard(input.nextInt());
            input.nextLine();
            System.out.println("Enter name People");
            people.setName(input.nextLine());
            System.out.println("Enter Birthday");
            people.setBirthday(input.nextInt());
            System.out.println("Enter Intime");
            people.setInTime(input.nextInt());
        } else if (flag == " update") {

        }
        return people;
    }
}

