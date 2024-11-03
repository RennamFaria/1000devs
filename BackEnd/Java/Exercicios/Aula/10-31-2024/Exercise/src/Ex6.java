import java.util.Scanner;

public class Ex6 {
    public Ex6() {
        Scanner input = new Scanner (System.in);
        int value, countPositive = 0, countNegative = 0, countNeutral = 0, i = 0;

        System.out.println("Type 5 numbers inters");
        do{
            value = input.nextInt();
            if(value > 0){
                countPositive++;
            }
            else if(value < 0){
                countNegative++;
            }
            else{
                countNeutral++;
            }

            i++;
        }while(i < 5);

        System.out.println("You type in total:");
        System.out.println(countPositive + " positive number(s)");
        System.out.println(countNegative + " negative number(s)");
        System.out.println(countNeutral + " neutral number(s) (zero)");

        input.close();
    }
}
