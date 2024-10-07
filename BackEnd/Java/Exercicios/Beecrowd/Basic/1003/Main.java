import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, sum;

        a = input.nextInt();
        input.nextLine();
        
        b = input.nextInt();
        input.nextLine();

        sum = a + b;

        System.out.println("SOMA = " + sum);

        input.close();
    }
}
