import java.util.Scanner;

public class HTLH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                for (int i = 1; i <= 7; i++) {
                    for (int j = 7-i; j >0 ; j--) {
                        System.out.print(" ");
                    }
                for (int k = 2 ; k <= i ; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}