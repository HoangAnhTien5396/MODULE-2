package Entities;
public class Phonebook {
    private int id ;
    private String name ;
    private String numberPhone ;
    private String address;
    private String email;
    private String faceBook;

    public Phonebook() {
    }

    public Phonebook(int id , String name, String numberPhone, String address, String email, String faceBook) {
        this.id = id ;
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
        this.email = email;
        this.faceBook = faceBook;
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaceBook() {
        return faceBook;
    }

    public void setFaceBook(String faceBook) {
        this.faceBook = faceBook;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", faceBook='" + faceBook + '\'' +
                '}';
    }
}