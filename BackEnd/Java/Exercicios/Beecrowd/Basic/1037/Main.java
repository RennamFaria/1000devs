import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1037.java
public class Ex1037 {
    public void ex1037() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1037/Main.java
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
