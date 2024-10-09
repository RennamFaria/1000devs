import java.util.Scanner;

public class Ex1014 {
    public void ex1014() {
        Scanner input = new Scanner(System.in);
        int distance;
        double fuelSpend, total;

        distance = input.nextInt();
        fuelSpend = input.nextDouble();

        total = distance/fuelSpend;

        System.out.printf("%.3f km/l\n", total);

        input.close();
    }
}
