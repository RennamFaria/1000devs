import java.util.Scanner;

public class Ex1004 {
    public void ex1004() {
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
