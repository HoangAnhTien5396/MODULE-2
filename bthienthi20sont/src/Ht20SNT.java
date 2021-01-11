import java.util.Scanner;

public class Ht20SNT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so NT can in");
        int numbers = input.nextInt();
        int status = 1;
        int num = 3;
        if ( numbers >= 1 ) {
            System.out.println(numbers + " so dau tien");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=numbers ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}
