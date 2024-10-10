import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1007.java
public class Ex1007 {
    public void ex1007() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main (String[] arg){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1007/Main.java
        Scanner input = new Scanner(System.in);
        int a, b, c, d, dif;

        a = input.nextInt();
        input.nextLine();

        b = input.nextInt();
        input.nextLine();

        c = input.nextInt();
        input.nextLine();

        d = input.nextInt();
        input.nextLine();

        dif = ((a * b) - (c * d));

        System.out.println("DIFERENCA = " + dif);

        input.close();
    }
}