
/*
Exercício 01: Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro quadrado.
*/
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float front, side, price, finalPrice;

    System.out.println("Type the front of the terrain: ");
    front = input.nextFloat();
    input.nextLine();  // Clean buffer

    System.out.println("Now the side of the terrain: ");
    side = input.nextFloat();
    input.nextLine();  // Clean buffer

    System.out.println("Say what the price of the terrain, by cubic meters: ");
    price = scan.nextFloat();

    finalPrice = price * (front * side);

    System.out.printf("This is the price that you will pay: R$%,.2f\n", finalPrice);

    input.close();
  }
}