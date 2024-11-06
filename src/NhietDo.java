import java.util.Scanner;

public class NhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        double c;
        int choice;

        do {
            System.out.println("Menu. ");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter F: ");
                    f = input.nextDouble();
                    System.out.println("Enter C: " + doF(f));
                    break;
                    case 2:
                        System.out.println("Enter C: ");
                        c = input.nextDouble();
                        System.out.println("Enter F: " + doC(c));
                        break;
                        case 0:
                            System.exit(0);
            }

        }while (choice != 0);
    }
    public static double doC(double c){
        double f = (9.0 / 5)* c + 32;
        return f;
    }
    public static double doF(double f){
        double c = (5.0/9)*(f - 32);
        return c;
    }
}
