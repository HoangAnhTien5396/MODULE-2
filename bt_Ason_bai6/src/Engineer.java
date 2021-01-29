public class Engineer extends Officers{
    private String trainingIndustry;
    public Engineer(){

    }

    public Engineer(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public Engineer(String name, int birthday, String sex, String address, String trainingIndustry) {
        super(name, birthday, sex, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return
                "Engineer{" +
                        "name='" + getName() + '\'' +
                        ", birthday=" + getBirthday() +
                        ", sex='" + getSex() + '\'' +
                        ", address='" + getAddress() + '\'' +
                "trainingIndustry='" + trainingIndustry + '\'' +
                '}';
    }
}
