import java.util.Scanner;

public class Ex8 {
    public Ex8() {
        Scanner input = new Scanner (System.in);
        int value, maxNumber = -99999, minNumber = 99999;

        System.out.println("Type 6 int numbers: ");
        for(int i = 0; i < 6; i++){
            value = input.nextInt();

            if(value > maxNumber){
                maxNumber = value;
            }
            else if(value < minNumber){
                minNumber = value;
            }
        }

        System.out.println();

        System.out.println("The bigger number typed was: " + maxNumber);
        System.out.println("The smaller number typed was: " + minNumber);
        
        input.close();
    }
}
