import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1 . Add : ");
            System.out.println("2 . Delete :");
            System.out.println("3 . Update :");
            System.out.println("4 . Show :");
            System.out.println("5 . Search :");
            System.out.println("6 . Sort :");
            System.out.println(" Choice ? ");
            int choice = input.nextInt();
            switch (choice){
                case 1 :
                    Book b = new Book();
                    System.out.println("Id ");
                    b.setId(input.nextInt());
                    System.out.println("Name");
                    input.nextLine();
                    b.setName(input.nextLine());
                    System.out.println("Price");
                    b.setPrice(input.nextDouble());
                    m.add(b);
                    break;
                case 2 :
                    System.out.println("Id ");
                    int id = input.nextInt();
                    m.delete(id);
                    break;
                case 3:
                    Book b1 = new Book();
                    System.out.println("Id ");
                    b1.setId(input.nextInt());
                    System.out.println("Name");
                    b1.setName(input.nextLine());
                    System.out.println("Price");
                    b1.setPrice(input.nextDouble());
                    m.update(b1);
                    break;
                case 4:
                    m.showAll();
                    break;
                case 5 :
                    System.out.println("Name");
                    input.nextLine();
                    String name = input.nextLine();
                    m.search(name);break;
                case 6 :
                    m.Sort();
                    break;
            }
        }while (true);
    }
}
