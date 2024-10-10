import java.util.Scanner;

<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1004.java
public class Ex1004 {
    public void ex1004() {
=======
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1004/Main.java
        Scanner input = new Scanner(System.in);
        int a, b, prod;

        a = input.nextInt();
        input.nextLine();
        
        b = input.nextInt();
        input.nextLine();

        prod = a * b;

        System.out.println("PROD = " + prod);

        input.close();
    }
}
