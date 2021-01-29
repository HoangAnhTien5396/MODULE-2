public class Staff extends Officers{
    private String work ;
    public Staff(){

    }

    public Staff(String work) {
        this.work = work;
    }

    public Staff(String name, int birthday, String sex, String address, String work) {
        super(name, birthday, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return
                "Staff{" +
                        "name='" + getName() + '\'' +
                        ", birthday=" + getBirthday() +
                        ", sex='" + getSex() + '\'' +
                        ", address='" + getAddress() + '\'' +
                "work='" + work + '\'' +
                '}';
    }
}
