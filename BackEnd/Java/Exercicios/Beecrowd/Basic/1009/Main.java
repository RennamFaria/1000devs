import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        double salary, monthSells, total;
        String name;

        name = input.nextLine();

        salary = input.nextFloat();
        input.nextLine();

        monthSells = input.nextFloat();
        input.nextLine();

        total = salary + (monthSells * 0.15f);

        System.out.printf("TOTAL = R$ %.2f\n", total);
        
        input.close();
    }
}