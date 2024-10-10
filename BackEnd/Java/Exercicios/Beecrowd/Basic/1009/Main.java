import java.util.Scanner;

<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1009.java
public class Ex1009 {
    public void ex1009() {
=======
public class Main {
    public static void main (String[] arg){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1009/Main.java
        Scanner input = new Scanner(System.in);
        double salary, monthSells, total;
        String name;

        name = input.nextLine();

        salary = input.nextFloat();
        input.nextLine();

        monthSells = input.nextFloat();
        input.nextLine();

        total = salary + (monthSells * 0.15f);

        System.out.printf("TOTAL = R$ %.2f\n", total);
        
        input.close();
    }
}