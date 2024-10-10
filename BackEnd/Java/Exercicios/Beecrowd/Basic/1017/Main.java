import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1017.java
public class Ex1017 {
    public void ex1017() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1017/Main.java
        Scanner input = new Scanner(System.in);
        int time, speed;
        double liters;

        time = input.nextInt();
        speed = input.nextInt();

        liters = (time * speed) / 12.0;

        System.out.printf("%.3f\n", liters);

        input.close();
    }
}
