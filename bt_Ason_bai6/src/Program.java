import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Search");
            System.out.println("4.Show");
            System.out.println("5.Sort");
            System.out.println("6.Update");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Officers o = new Officers();
                    System.out.println("1. Worker ?");
                    System.out.println("2. Engineer ?");
                    System.out.println("3. Staff ?");
                    int choice2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            Worker w = new Worker();
                            System.out.println("Name");
                            input.nextLine();
                            w.setName(input.nextLine());
                            System.out.println("Birthday");
                            w.setBirthday(input.nextInt());
                            System.out.println("Sex");
                            input.nextLine();
                            w.setSex(input.nextLine());
                            System.out.println("Address");
                            w.setAddress(input.nextLine());
                            System.out.println("Lever");
                            w.setLever(input.nextDouble());
                            m.add(w);
                            break;
                        case 2:
                            Engineer e = new Engineer();
                            System.out.println("Name");
                            input.nextLine();
                            e.setName(input.nextLine());
                            System.out.println("Birthday");
                            e.setBirthday(input.nextInt());
                            System.out.println("Sex");
                            input.nextLine();
                            e.setSex(input.nextLine());
                            System.out.println("Address");
                            e.setAddress(input.nextLine());
                            System.out.println("TrainingIndustry");
                            e.setTrainingIndustry(input.nextLine());
                            m.add(e);
                            break;
                        case 3:
                            Staff s = new Staff();
                            System.out.println("Name");
                            input.nextLine();
                            s.setName(input.nextLine());
                            System.out.println("Birthday");
                            s.setBirthday(input.nextInt());
                            System.out.println("Sex");
                            input.nextLine();
                            s.setSex(input.nextLine());
                            System.out.println("Address");
                            s.setAddress(input.nextLine());
                            System.out.println("Work");
                            s.setWork(input.nextLine());
                            m.add(s);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Name is ?");
                    String name = input.nextLine();
                    m.delete(name);
                    break;
                case 3:
                    System.out.println("Name is ?");
                    String name1 = input.nextLine();
                    m.search(name1);
                    break;
                case 4:
                    m.showAll();
                    break;
                case 5:
                    m.sort();
                    break;
                case 6:
                    System.out.println("1. Worker ?");
                    System.out.println("2. Engineer ?");
                    System.out.println("3. Staff ?");
                    int choice1 = input.nextInt();
                    switch (choice1) {
                        case 1:
                            Worker w = new Worker();
                            System.out.println("Name update");
                            input.nextLine();
                            w.setName(input.nextLine());
                            System.out.println("Address update");
                            w.setAddress(input.nextLine());
                            System.out.println("Sex update");
                            w.setSex(input.nextLine());
                            System.out.println("Birthday update");
                            w.setBirthday(input.nextInt());
                            System.out.println("Lever update");
                            w.setLever(input.nextDouble());
                            m.update(w);
                            break;
                        case 2:
                            Engineer e = new Engineer();
                            System.out.println("Name update");
                            input.nextLine();
                            e.setName(input.nextLine());
                            System.out.println("Address update");
                            e.setAddress(input.nextLine());
                            System.out.println("Sex update");
                            e.setSex(input.nextLine());
                            System.out.println("Birthday update");
                            e.setBirthday(input.nextInt());
                            System.out.println("Lever update");
                            e.setTrainingIndustry(input.nextLine());
                            m.update(e);
                            break;
                        case 3:
                            Staff s = new Staff();
                            System.out.println("Name update");
                            input.nextLine();
                            s.setName(input.nextLine());
                            System.out.println("Address update");
                            s.setAddress(input.nextLine());
                            System.out.println("Sex update");
                            s.setSex(input.nextLine());
                            System.out.println("Birthday update");
                            s.setBirthday(input.nextInt());
                            System.out.println("Lever update");
                            s.setWork(input.nextLine());
                            m.update(s);
                            break;
                    }break;
            }
        } while (true) ;
        }
    }
