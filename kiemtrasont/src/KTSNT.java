import java.util.Scanner;

public class KTSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so");
        int a = scanner.nextInt();
        if (a < 2){
            System.out.println(a + "KPSNT");
        } else {
            int i = 2 ;
            boolean check = true;
            while (i < Math.sqrt(a)){
                if (a % i == 0){
                    check = false;
                    break;
                }i++;
            }
        if (check)
            System.out.println(a + " LSNT");
        else
            System.out.println(a + "KPSNT");
        }

    }
}
