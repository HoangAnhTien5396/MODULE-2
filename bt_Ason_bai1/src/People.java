public class People extends Hotel{
    private String name;
    private int birthday;
    private int idCard;
    private int inTime;
    private int outTime;
    public People(){

    }
    public People(String name, int birthday,int idCard,int inTime){
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.inTime = inTime;
    }

    public int getOutTime() {
        return outTime;
    }

    public void setOutTime(int outTime) {
        this.outTime = outTime;
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

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getInTime() {
        return inTime;
    }

    public void setInTime(int inTime) {
        this.inTime = inTime;
    }

    @Override
    public String toString(){
        return "id :" + this.idCard + "\n" + "name :" + this.name + "\n" + "birthday :" + this.birthday + "inTime :" + this.inTime;
    }

}
