import java.util.ArrayList;
import java.util.List;

public class Officers {
    private String name;
    private int birthday;
    private String sex;
    private String address;
    List<Worker> workers = new ArrayList<>();
    List<Engineer> engineers = new ArrayList<>();
    List<Staff> staffs = new ArrayList<>();
    public Officers(){

    }

    public Officers(String name, int birthday, String sex, String address) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
