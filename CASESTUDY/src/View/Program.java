package View;

import Behavior.Methods;
import Entities.Customer;
import Entities.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner s = new Scanner(System.in);
                        do {
                            System.out.println("1 . Add  ");
                            System.out.println("2 . Delete ");
                            System.out.println("3 . Update ");
                            System.out.println("4 . Show Room ");
                            System.out.println("5 . Show All Empty");
                            System.out.println("6 . Show All");
                            System.out.println("7. Bill ");
                            try {
                                int choice = Integer.parseInt(s.nextLine());
                                switch (choice) {
                                    case 1:
                                        m.showAllEmpty();
                                        System.out.println("Nhập numberRoom");
                                        int n = Integer.parseInt(s.nextLine());
                                        System.out.println("Thêm bao nhiêu người ");
                                        int n1 = Integer.parseInt(s.nextLine());
                                        ArrayList<Customer> c = new ArrayList<>();
                                        for (int i = 0; i < n1; i++) {
                                            Customer customer = Menus.getInfoCustomer();
                                            c.add(customer);
                                        }
                                        System.out.println("Thêm bao nhiêu dịch vụ ");
                                        int d = Integer.parseInt(s.nextLine());
                                        ArrayList<Service> s1 = new ArrayList<>();
                                        for (int i = 0; i < d; i++) {
                                            Service service = Menus.getInfoService();
                                            s1.add(service);
                                        }
                                        System.out.println("Nhập timeIn");
                                        int t = Integer.parseInt(s.nextLine());
                                        m.add(n, c, s1, t);
                                        break;
                                    case 2:
                                        System.out.println("Nhập numberRoom");
                                        int n2 = Integer.parseInt(s.nextLine());
                                        System.out.println("Nhập nameService ");
                                        String n3 = s.nextLine();
                                        m.delete(n2, n3);
                                        break;
                                    case 3:
                                        System.out.println("Nhập numberRoom");
                                        int n4 = Integer.parseInt(s.nextLine());
                                        System.out.println("Nhập nameService ");
                                        String n5 = s.nextLine();
                                        System.out.println("Nhập price");
                                        int n6 = Integer.parseInt(s.nextLine());
                                        m.update(n4, n5, n6);
                                        break;
                                    case 4:
                                        System.out.println("Nhập numberRoom");
                                        int n7 = Integer.parseInt(s.nextLine());
                                        m.show(n7);
                                        break;
                                    case 5:
                                        m.showAllEmpty();
                                        break;
                                    case 6:
                                        m.showAll();
                                    case 7:
                                        System.out.println("Nhập numberRoom");
                                        int n8 = Integer.parseInt(s.nextLine());
                                        System.out.println("Nhập TimeOut");
                                        int n9 = Integer.parseInt(s.nextLine());
                                        m.show(n8);
                                        System.out.println("Thành tiền : " + m.Bill(n8, n9) + " VNĐ");
                                        break;
                                }
                            } catch (Exception e) {
                                System.out.println(" Lỗi nhập lại ");
                            }
                        } while (true);
                    }
}
