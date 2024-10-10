import java.util.Scanner;

<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1006.java
public class Ex1006 {
    public void ex1006() {
=======
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1006/Main.java
        Scanner input = new Scanner(System.in);
        double a, b, c, weighA, weighB, weighC, avg;

        weighA = 2;
        weighB = 3;
        weighC = 5;
        
        a = input.nextDouble();
        input.nextLine();
        
        b = input.nextDouble();
        input.nextLine();

        c = input.nextDouble();
        input.nextLine();

        avg = ((a * weighA) + (b * weighB) + (c * weighC))/(weighA + weighB + weighC);

        System.out.printf("MEDIA = %.1f\n",avg);

        input.close();
    }
}