package View;

import Behavior.Methods;
import Behavior.ReadWriteFile;
import Entities.Phonebook;

import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Show phoneBook");
            System.out.println("2: Add phoneBook");
            System.out.println("3: Update phoneBook");
            System.out.println("4: Delete phoneBook");
            System.out.println("5: Search phoneBook");
            System.out.println("6: Read from file ");
            System.out.println("7: Exit ");
            System.out.println("Select Function");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1 :
                    m.show();
                    break;
                case 2 :
                    System.out.println("1. Id");
                    int i = Integer.parseInt(input.nextLine());
                    System.out.println("2. Name");
                    String n = input.nextLine();
                    System.out.println("3. NumberPhone");
                    String p = input.nextLine();
                    System.out.println("4. Address");
                    String a = input.nextLine();
                    System.out.println("5. Email");
                    String e = input.nextLine();
                    System.out.println("6. Facebook");
                    String f = input.nextLine();
                    Phonebook phonebook = new Phonebook(i,n,p,a,e,f);
                    m.add(phonebook);
                    break;
                case 3 :
                    System.out.println("1. Id update");
                    int i1 = Integer.parseInt(input.nextLine());
                    System.out.println("1. Name update ");
                    String n1 = input.nextLine();
                    System.out.println("2. NumberPhone update");
                    String p1 = input.nextLine();
                    System.out.println("3. Address update");
                    String a1 = input.nextLine();
                    System.out.println("4. Email update");
                    String e1 = input.nextLine();
                    System.out.println("5. Facebook update");
                    String f1 = input.nextLine();
                    Phonebook phonebook1 = new Phonebook(i1,n1,p1,a1,e1,f1);
                    m.update(phonebook1);
                    break;
                case 4 :
                    System.out.println("Id search ?");
                    int n2 = Integer.parseInt(input.nextLine());
                    m.delete(n2);
                    break;
                case 5 :
                    System.out.println("Id search ? ");
                    int n3 = Integer.parseInt(input.nextLine());
                    m.search(n3);
                    break;
                case 6 :
                    String pathFile = "C:\\Users\\user\\Desktop\\MODULE-2\\Baithi_th\\src\\phoneBook.csv";
                    ReadWriteFile.readFromFileCsv(pathFile);
                    break;
                case 7:
                    System.exit(7);
                    break;
            }
        }while (true);
    }
}
