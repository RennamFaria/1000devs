import java.util.Scanner;

public class Ex1002 {
    public void ex1002() {
        Scanner input = new Scanner(System.in);
        double area;

        area = input.nextDouble();

        area = area * area * 3.14159;


        System.out.printf("A=%.4f\n",area);

        input.close();
    }
}