import java.util.Scanner;

public class QuadraticEquation {
    double a , b , c ;
    public QuadraticEquation (double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }
    public double getRoot1(){
        return -this.b + Math.sqrt(this.b* this.b - 4  *this.a * this.c) / 2 * this.a ;
    }
    public double getRoot2(){
        return -this.b - (Math.sqrt(this.b* this.b - 4  *this.a * this.c)) / 2 * this.a ;
    }

}
class Ex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        System.out.println(scanner.nextDouble());
        double a = scanner.nextDouble();
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        System.out.println("Nhap c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if ( delta > 0) {
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        }else if ( delta == 0){
            System.out.println(quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
