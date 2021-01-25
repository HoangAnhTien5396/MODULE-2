import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static teacherStaff getTeacherStaff(String flag) {
        teacherStaff t = null;
        if (flag.equals("Add")) {
            t = new teacherStaff();
            System.out.print("Enter id teacherStaff:");
            t.setId(input.nextInt());
            input.nextLine();
            System.out.println("Enter name teacherStaff");
            t.setName(input.nextLine());
            System.out.println("Enter Birthday");
            t.setBirthday(input.nextInt());
            input.nextLine();
            System.out.println("Enter Address");
            t.setAddress(input.nextLine());
            System.out.println("Enter Salary");
            t.setSalary(input.nextInt());
            System.out.println("Enter Reward");
            t.setReward(input.nextInt());
            System.out.println("Enter Punish");
            t.setPunish(input.nextInt());
        } else if (flag == " update") {

        }
        return t;
    }
}

