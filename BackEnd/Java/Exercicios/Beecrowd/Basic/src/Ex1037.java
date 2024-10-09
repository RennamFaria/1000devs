import java.util.Scanner;

public class Ex1037 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double value;

        value = input.nextDouble();

        if(value >= 0.00 && value <= 25.00){
            System.out.println("Intervalo [0,25]");
        }
        else if(value > 25.00 && value <= 50.00){
            System.out.println("Intervalo (25,50]");
        }   
        else if(value > 50.00 && value <= 75.00){
            System.out.println("Intervalo (50,75]");
        }   
        else if(value > 75.00 && value <= 100.00){
            System.out.println("Intervalo (75,100]");
        }   
        else
            System.out.println("Fora de intervalo");

        input.close();
    }
}
