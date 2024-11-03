import java.util.Scanner;

public class Ex4 {
    public Ex4() {
        Scanner input = new Scanner (System.in);
        char value = 's';
        while(value != 'n'){
            System.out.println("You want to continue the loop? ('s' or 'n')");
            value = input.next().charAt(0);
            
            if(value == 'n'){
                System.out.println("Exiting of the loop");
                break;
            }
            else if(value == 's'){
                System.out.println("Continuing the loop");
            }
            else{
                System.out.println("You type a worng character, type again");
            }
        }

        input.close();
    }
}
