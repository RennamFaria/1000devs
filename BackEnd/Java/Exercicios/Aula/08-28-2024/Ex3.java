/* 
Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras. O usuário devera informar a quantidade de cavalos adquiridos.
*/

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int qntHorse, totalH;
    float price, priceTotal;

    System.out.print("Inform the quantity of horses: ");
    qntHorse = input.nextInt();
    input.nextLine();  // Clean buffer

    System.out.print("Inform the cust of each horseshoe: ");
    price = input.nextFloat();

    totalH = qntHorse * 4;
    priceTotal = totalH * price;

    System.out.printf("You will need %d horses and pay R$ %,.2f for the horseshoe\n", totalH, priceTotal);

    input.close();
  }
}