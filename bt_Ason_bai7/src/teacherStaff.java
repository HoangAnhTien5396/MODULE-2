public class teacherStaff extends Officers{
    public int Salary;
    public int Punish;
    public int Reward;
    public teacherStaff(){

    }
    public teacherStaff(int id , String name , int Birthday, String Address,int Salary , int Punish , int Reward){
        super(id,name,Birthday,Address);
        this.Salary = Salary;
        this.Punish = Punish;
        this.Reward = Reward;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getPunish() {
        return Punish;
    }

    public void setPunish(int punish) {
        Punish = punish;
    }

    public int getReward() {
        return Reward;
    }

    public void setReward(int reward) {
        Reward = reward;
    }

    @Override
    public String toString() {
        return "id : " + getId()
                +"\n"
                + "Name : " + getName();
    }
}