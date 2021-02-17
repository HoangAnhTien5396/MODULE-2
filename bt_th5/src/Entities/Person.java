package Entities;

public class Person {
    private int id ;
    private String name;
    private String birthDay;
    private String job;
    public Person(){

    }

    public Person(int id, String name, String birthDay, String job) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Entities.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
