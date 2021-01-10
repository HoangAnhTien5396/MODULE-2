import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap USD");
        usd = sc.nextDouble();
        double quydoi = usd * vnd ;
        System.out.println(quydoi);



    }
}
