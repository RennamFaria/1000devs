import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, prod;

        a = input.nextInt();
        input.nextLine();
        
        b = input.nextInt();
        input.nextLine();

        prod = a * b;

        System.out.println("PROD = " + prod);

        input.close();
    }
}
