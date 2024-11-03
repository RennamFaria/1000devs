import java.util.Scanner;

public class Ex9 {
    public Ex9() {
        Scanner input = new Scanner(System.in);
        int value, count1 = 0, count2 = 0, count3 = 0, count4 = 0;

        do{
            value = input.nextInt();

            if(value >= 0 && value <= 25){
                count1++;
            }
            else if(value >= 26 && value <= 50){
                count2++;
            }
            else if(value >= 51 && value <= 75){
                count3++;
            }
            else if(value >= 76 && value <= 100){
                count4++;
            }

        }while(value >= 0);

        System.out.println("The quantity of numbers typed in each interval was: ");
        System.out.println(count1 + " for [0, 25]");
        System.out.println(count2 + " for [26, 50]");
        System.out.println(count3 + " for [51, 75]");
        System.out.println(count4 + " for [76, 100]");

        input.close();
    }
}
