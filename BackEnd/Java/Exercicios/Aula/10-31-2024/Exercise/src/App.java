import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("What exercise do you want to do?: ");
        int i = input.nextInt();
        System.out.println("Doing the Ex" + i);
        System.out.println();

        System.out.printf("%%");

        switch(i){
            case 1:
                new Ex1();
                break;
            case 2:
                new Ex2();
                break;
            case 3:
                new Ex3();
                break;
            case 4:
                new Ex4();
                break;
            case 5:
                new Ex5();
                break;
            case 6:
                new Ex6();
                break;
            case 7:
                new Ex7();
                break;
            case 8:
                new Ex8();
                break;
            case 9:
                new Ex9();
                break;
            case 10:
                new Ex10();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        input.close();
    }
}