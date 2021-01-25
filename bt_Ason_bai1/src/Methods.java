import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    ArrayList<People> people = new ArrayList<>();
    Scanner i = new Scanner(System.in);
    public void add(People p ){
        people.add(p);
    }
    public void Bill(int id) {
        for (People t : people) {
            if (t.getIdCard() == id) {
                System.out.println("OutTime is : ");
                t.setOutTime(i.nextInt());
                System.out.println(" Bill " + (t.getOutTime()-t.getInTime())* 60 + "VND");
            }
        }
    }
    public void delete(int id){
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getIdCard() == id) {
                people.remove(people.get(i));
            }
        }
    }
    public void show() {
        for (People people : people) {
            System.out.println(people.toString());
        }
    }
}
