import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a, b, c, weighA, weighB, weighC, avg;

        weighA = 2;
        weighB = 3;
        weighC = 5;
        
        a = input.nextDouble();
        input.nextLine();
        
        b = input.nextDouble();
        input.nextLine();

        c = input.nextDouble();
        input.nextLine();

        avg = ((a * weighA) + (b * weighB) + (c * weighC))/(weighA + weighB + weighC);

        System.out.printf("MEDIA = %.1f\n",avg);

        input.close();
    }
}