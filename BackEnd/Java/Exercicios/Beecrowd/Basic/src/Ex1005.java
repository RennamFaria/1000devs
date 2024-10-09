import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a, b, weightA, weightB, avg;

        weightA = 3.5;
        weightB = 7.5;
        
        a = input.nextDouble();
        input.nextLine();
        
        b = input.nextDouble();
        input.nextLine();

        avg = ((a * weightA) + (b * weightB))/(weightA + weightB);

        System.out.printf("MEDIA = %.5f\n",avg);

        input.close();
    }
}
