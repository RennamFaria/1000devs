import java.util.Scanner;

<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1035.java
public class Ex1035 {
    public void ex1035() {
=======
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1035/Main.java
        Scanner input = new Scanner(System.in);
        int a, b, c, d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        if((b > c) && (d > a) && ((c + d) > (a + b)) && ((c >= 0) && (d >= 0)) && ((a % 2) == 0))
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores nao aceitos");

        input.close();
    }
}
