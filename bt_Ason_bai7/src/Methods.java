import java.util.ArrayList;

public class Methods {
    ArrayList<teacherStaff> teacherStaffs = new ArrayList<>();

    public void add(teacherStaff t) {
        teacherStaffs.add(t);
    }

    public void showInformation() {
        for (teacherStaff t : teacherStaffs) {
            System.out.println(t.toString());
        }
    }

    public void Payroll(int id) {
        for (teacherStaff t : teacherStaffs) {
            if (t.getId() == id) {
                System.out.println(" Payroll is " + (t.getSalary() + t.getReward() - t.getPunish()));
            }
        }
    }
    public void showInformation8() {
        for (teacherStaff t : teacherStaffs) {
            if ((t.getSalary() + t.getReward() - t.getPunish() >= 8)){
                System.out.println(t.toString());
            }
        }
    }
}
