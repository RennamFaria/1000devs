import java.util.Scanner;

public class Ex1013{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c, total;

        a = input.nextInt();

        b = input.nextInt();

        c = input.nextInt();

        total = (a + b + Math.abs(a-b))/2;

        if(total > c)
            System.out.print(total);
        else
            System.out.print(c);

        System.out.println(" eh o maior");

        input.close();
    }
}