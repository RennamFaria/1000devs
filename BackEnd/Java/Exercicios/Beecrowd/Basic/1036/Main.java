import java.util.Scanner;
import java.lang.Math; 

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1036.java
public class Ex1036 {
    public void ex1036() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1036/Main.java
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, result1, result2;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        delta  = (b * b) - (4 * a * c);

        if(delta <= 0 || a == 0){
            System.out.println("Impossivel calcular");
        }
        else{
            result1 = (((-b) + (Math.sqrt(delta))) / (2 * a));
            result2 = (((-b) - (Math.sqrt(delta))) / (2 * a));

            System.out.printf("R1 = %.5f\n", result1);
            System.out.printf("R2 = %.5f\n", result2);
        }

        input.close();
    }
}
