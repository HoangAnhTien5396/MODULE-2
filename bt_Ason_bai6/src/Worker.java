public class Worker extends Officers{
    private double lever ;
    public Worker(){

    }

    public Worker(double lever) {
        this.lever = lever;
    }

    public Worker(String name, int birthday, String sex, String address, double lever) {
        super(name, birthday, sex, address);
        this.lever = lever;
    }

    public double getLever() {
        return lever;
    }

    public void setLever(double lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return
                "Worker{" +
                "name='" + getName() + '\'' +
                ", birthday=" + getBirthday() +
                ", sex='" + getSex() + '\'' +
                ", address='" + getAddress() + '\'' +
                "lever=" + lever +
                '}';
    }
}
