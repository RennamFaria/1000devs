import java.util.Scanner;
 
public class Ex1011 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius, pi, volume;

        pi = 3.14159;

        radius = input.nextDouble();
        input.nextLine();

        volume = ((4.0/3.0) * pi * (radius * radius * radius));      //  4/3 = 1,33...

        System.out.printf("VOLUME = %.3f\n", volume);

        input.close();
    }
}
