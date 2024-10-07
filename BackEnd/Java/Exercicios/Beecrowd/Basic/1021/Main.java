import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money;
        int counter; 

        money = input.nextDouble();

        System.out.println("NOTAS:");

        counter = (int) money / 100;
        System.out.println(counter + " nota(s) de R$ 100.00");
        money = money - (100 * counter);

        counter = (int) money / 50;
        System.out.println(counter + " nota(s) de R$ 50.00");
        money = money - (50 * counter);

        counter = (int) money / 20;
        System.out.println(counter + " nota(s) de R$ 20.00");
        money = money - (20 * counter);

        counter = (int) money / 10;
        System.out.println(counter + " nota(s) de R$ 10.00");
        money = money - (10 * counter);

        counter = (int) money / 5;
        System.out.println(counter + " nota(s) de R$ 5.00");
        money = money - (5 * counter);

        counter = (int) money / 2;
        System.out.println(counter + " nota(s) de R$ 2.00");
        money = money - (2 * counter);

        System.out.println("MOEDAS:");

        counter = (int) money / 1;
        System.out.println(counter + " moeda(s) de R$ 1.00");
        money = money - (1 * counter);        

        money *= 100; //multipliyng to 100 to transform the decimal to int, then count like notes, but is cents
        
        counter = (int) money / 50;
        System.out.println(counter + " moeda(s) de R$ 0.50");
        money = money - (50 * counter);

        counter = (int) money / 25;
        System.out.println(counter + " moeda(s) de R$ 0.25");
        money = money - (25 * counter);

        counter = (int) money / 10;
        System.out.println(counter + " moeda(s) de R$ 0.10");
        money = money - (10 * counter);

        counter = (int) money / 5;
        System.out.println(counter + " moeda(s) de R$ 0.05");
        money = money - (5 * counter);

        counter = (int) money / 1;
        System.out.println(counter + " moeda(s) de R$ 0.01");

        input.close();
    }
}
