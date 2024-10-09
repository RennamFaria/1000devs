import java.util.Scanner;

public class Ex1017 {
    public void ex1017() {
        Scanner input = new Scanner(System.in);
        int time, speed;
        double liters;

        time = input.nextInt();
        speed = input.nextInt();

        liters = (time * speed) / 12.0;

        System.out.printf("%.3f\n", liters);

        input.close();
    }
}
