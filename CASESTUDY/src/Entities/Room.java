package Entities;

import java.util.ArrayList;

public class Room {
    private int numberRoom ;
    private String typeRoom;
    private long priceRoom;
    private int timeIn;
    private int timeOut;
    ArrayList<Customer> customers ;
    ArrayList<Service> services;
    public Room() {
    }

    public Room(int numberRoom, String typeRoom, long priceRoom, ArrayList<Customer> customers , ArrayList<Service> services) {
        this.numberRoom = numberRoom;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
        this.customers = customers;
        this.services = services;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public long getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(long priceRoom) {
        this.priceRoom = priceRoom;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public int getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberRoom=" + numberRoom +
                ", typeRoom='" + typeRoom + '\'' +
                ", priceRoom=" + priceRoom +
                ", timeIn=" + timeIn +
                ", customers=" + customers +
                ", services=" + services +
                '}';
    }
}
