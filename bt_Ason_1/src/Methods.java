import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    ArrayList<Student> students = new ArrayList<>();
    public void add(Student s) {
        students.add(s);
    }

    public void delete(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(students.get(i));
            }
        }
    }

    public void update(Student student) {
        for (Student s : students) {
            if (student.getId() == s.getId()) {
                s.setName(student.getName());
            }
        }
    }

    public void showAll() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public void search(String name) {
        for (Student s : students) {
            if(s.getName().equals(name)){
                System.out.println(s.toString());
            }
        }
    }
}