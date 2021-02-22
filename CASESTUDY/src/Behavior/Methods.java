package Behavior;

import Entities.Customer;
import Entities.Room;
import Entities.Service;

import java.util.ArrayList;

public class Methods {
    static ArrayList<Room> rooms = new ArrayList<>();
    static {
        rooms.add(new Room(101,"Normal",120000,new ArrayList<>(),new ArrayList<>()));
        rooms.add(new Room(102,"Normal",120000,new ArrayList<>(),new ArrayList<>()));
        rooms.add(new Room(103,"Normal",120000,new ArrayList<>(),new ArrayList<>()));
        rooms.add(new Room(201,"Vip",180000,new ArrayList<>(),new ArrayList<>()));
        rooms.add(new Room(202,"Vip",180000,new ArrayList<>(),new ArrayList<>()));
        rooms.add(new Room(203,"Vip",180000,new ArrayList<>(),new ArrayList<>()));
    }
    static ArrayList<Service> services = new ArrayList<>();
    static {
        services.add(new Service("Coca",15000));
        services.add(new Service("Pepsi",15000));
        services.add(new Service("Bimbim",10000));
        services.add(new Service("Juice",60000));
        services.add(new Service("Beer",20000));
        services.add(new Service("Vịn",300000));
    }
    public void add (int numberRoom , ArrayList<Customer> customers, ArrayList<Service> services , int timeIn){
        for ( Room r : rooms){
            if (r.getNumberRoom() == numberRoom){
                r.setCustomers(customers);
                r.setServices(services);
                r.setTimeIn(timeIn);
            }
        }
    }
    public void delete (int numberRoom,String nameService){
        for (Room r : rooms){
            if ( r.getNumberRoom() == numberRoom){
                r.getServices().removeIf(s -> s.getName().equals(nameService));
            }
        }
    }
    public void update(int numberRoom, String nameService,int price){
        for (Room r : rooms) {
            if (r.getNumberRoom() == numberRoom) {
                for (Service s : r.getServices()) {
                    if (s.getName().equals(nameService)) {
                        s.setPrice(price);
                    }
                }
            }
        }
    }
    public void show(int numberRoom){
        for (Room r : rooms){
            if ( r.getNumberRoom() == numberRoom){
                System.out.println(r);
            }
        }
    }
    public void showAllEmpty(){
        for (Room r : rooms) {
            if (r.getCustomers().size() == 0) {
                System.out.println(r);
            }
        }
    }
    public long Bill(int numberRoom , int timeOut){
        long total = 0 ;
        for (Room r : rooms){
            if (r.getNumberRoom() == numberRoom){
                int priceService = 0;
                for ( Service s : r.getServices()){
                    priceService += s.getPrice();
                }
                total = priceService + r.getPriceRoom() * ( timeOut - r.getTimeIn());
                r.getCustomers().clear();
                r.getServices().clear();
                r.setTimeIn(0);
            }
        }
        return total;
    }
    public void showAll(){
        for ( Room r : rooms){
            System.out.println(r);
        }
    }
}
