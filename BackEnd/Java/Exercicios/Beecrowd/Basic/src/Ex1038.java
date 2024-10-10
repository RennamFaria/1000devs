import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numb, count;
        double total = 0.00;

        numb = input.nextInt();
        count = input.nextInt();

        if(numb == 1 )
            total = 4.00 * count;
        if(numb == 2)
            total = 4.50 * count;
        if(numb == 3)
            total = 5.00 * count;
        if(numb == 4)
            total = 2.00 * count;
        if(numb == 5)
            total = 1.50 * count;

        System.out.printf("Total: R$ %.2f\n", total);

        input.close();
    }
}
