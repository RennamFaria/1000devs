import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1008.java
public class Ex1008 {
    public void ex1008() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main (String[] arg){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1008/Main.java
        Scanner input = new Scanner(System.in);
        int qntEmpl, hours;
        float salary, total;

        qntEmpl = input.nextInt();
        input.nextLine();

        hours = input.nextInt();
        input.nextLine();

        salary = input.nextFloat();
        input.nextLine();

        total = hours * salary;

        System.out.println("NUMBER = "+ qntEmpl);
        System.out.printf("SALARY = U$ %.2f\n", total);

        
        input.close();
    }
}