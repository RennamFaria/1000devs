import java.util.Scanner;

<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1010.java
public class Ex1010 {
    public void ex1010() {
=======
public class Main {
    public static void main (String[] arg){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1010/Main.java
        Scanner input = new Scanner(System.in);
        int id, qntProducts;
        double price, total;

        total = 0f;

        for(int i = 0; i < 2; i++){
            id = input.nextInt();

            qntProducts = input.nextInt();

            price = input.nextFloat();

            total = total + (price * qntProducts);
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
        input.close();
    }
}