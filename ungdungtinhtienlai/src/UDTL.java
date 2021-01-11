import java.util.Scanner;

public class UDTL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tien gui");
        double money = input.nextDouble();
        System.out.println("Nhap so thang gui");
        int month = input.nextInt();
        System.out.println("Nhap ti le lai suat");
        double ls = input.nextDouble();
        double total = 0;
        for (int i = 0 ; i < month ; i++){
            total += money * (ls/100)/12*month;
        }
        System.out.println(total);
    }
}
