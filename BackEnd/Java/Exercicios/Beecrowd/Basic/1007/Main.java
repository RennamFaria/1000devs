import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        int a, b, c, d, dif;

        a = input.nextInt();
        input.nextLine();

        b = input.nextInt();
        input.nextLine();

        c = input.nextInt();
        input.nextLine();

        d = input.nextInt();
        input.nextLine();

        dif = ((a * b) - (c * d));

        System.out.println("DIFERENCA = " + dif);

        input.close();
    }
}