import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        int qntEmpl, hours;
        float salary, total;

        qntEmpl = input.nextInt();
        input.nextLine();

        hours = input.nextInt();
        input.nextLine();

        salary = input.nextFloat();
        input.nextLine();

        total = hours * salary;

        System.out.println("NUMBER = "+ qntEmpl);
        System.out.printf("SALARY = U$ %.2f\n", total);

        
        input.close();
    }
}