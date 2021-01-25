public class Officers {
    public int id;
    public String name;
    public int Birthday;
    public String Address;
    public Officers() {
    }
    public Officers(int id , String name , int Birthday, String Address){
        this.id = id ;
        this.name = name;
        this.Birthday = Birthday;
        this.Address = Address;
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

    public int getBirthday() {
        return Birthday;
    }

    public void setBirthday(int birthday) {
        Birthday = birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
