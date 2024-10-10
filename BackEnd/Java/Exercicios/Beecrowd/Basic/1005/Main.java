import java.util.Scanner;

<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1005.java
public class Ex1005 {
    public void ex1005() {
=======
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1005/Main.java
        Scanner input = new Scanner(System.in);
        double a, b, weightA, weightB, avg;

        weightA = 3.5;
        weightB = 7.5;
        
        a = input.nextDouble();
        input.nextLine();
        
        b = input.nextDouble();
        input.nextLine();

        avg = ((a * weightA) + (b * weightB))/(weightA + weightB);

        System.out.printf("MEDIA = %.5f\n",avg);

        input.close();
    }
}