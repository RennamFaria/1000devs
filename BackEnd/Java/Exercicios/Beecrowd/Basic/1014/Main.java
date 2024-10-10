import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1014.java
public class Ex1014 {
    public void ex1014() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main (String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1014/Main.java
        Scanner input = new Scanner(System.in);
        int distance;
        double fuelSpend, total;

        distance = input.nextInt();
        fuelSpend = input.nextDouble();

        total = distance/fuelSpend;

        System.out.printf("%.3f km/l\n", total);

        input.close();
    }
}
