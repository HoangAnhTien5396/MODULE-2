
public class Students {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Students(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
class TestStaticMethod {
    public static void main(String args[]) {
        Students.change(); //calling change method

        //creating objects
        Students s1 = new Students(111, "Hoang");
        Students s2 = new Students(222, "Khanh");
        Students s3 = new Students(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
