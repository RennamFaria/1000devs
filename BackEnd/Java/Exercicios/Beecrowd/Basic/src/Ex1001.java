import java.util.Scanner;

public class Ex1001 {
    public void ex1001() {
        Scanner input = new Scanner(System.in);
        int A, B, X;

        A = input.nextInt();
        input.nextLine();

        B = input.nextInt();
        input.nextLine();

        X = A + B;  

        System.out.println("X = "+ X);

        input.close();
    }
}
