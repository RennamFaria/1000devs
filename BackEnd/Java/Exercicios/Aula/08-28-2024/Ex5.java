/*
A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos que deverá ser informado pelo usuário.
*/

import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int qntChicken;
    float finalPrice;

    System.out.print("Type the quantity of chikens: ");
    qntChicken = input.nextInt();

    finalPrice = qntChicken * (4.00f + (2 * (3.50f)));

    System.out.print("\nThe total price to pay for indentify chickens is: R$ " + finalPrice);

    input.close();
  }
}