import java.util.Scanner;

public class Ex1018 {
    public void ex1018() {
        Scanner input = new Scanner(System.in);
        int money, hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;

        money = input.nextInt();

        System.out.println(money);

        while(money >= 100){
            money = money - 100;
            hundred++;
        }
        while(money >= 50){
            money = money - 50;
            fifty++;
        }
        while(money >= 20){
            money = money - 20;
            twenty++;
        }
        while(money >= 10){
            money = money - 10;
            ten++;
        }
        while(money >= 5){
            money = money - 5;
            five++;
        }
        while(money >= 2){
            money = money - 2;
            two++;
        }
        while(money >= 1){
            money = money - 1;
            one++;
        }

        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");

        input.close();
    }
}