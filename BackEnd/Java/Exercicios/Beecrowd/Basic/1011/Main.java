import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1011.java
public class Ex1011 {
    public void ex1011() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1011/Main.java
        Scanner input = new Scanner(System.in);
        double radius, pi, volume;

        pi = 3.14159;

        radius = input.nextDouble();
        input.nextLine();

        volume = ((4.0/3.0) * pi * (radius * radius * radius));      //  4/3 = 1,33...

        System.out.printf("VOLUME = %.3f\n", volume);

        input.close();
    }    
}
