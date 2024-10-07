/*
A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 120 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.
*/

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int qntSandwich;

    System.out.print("Type the quantity of sandwich: ");
    qntSandwich = input.nextInt();

    System.out.print("\nTo make " + qntSandwich + " sandwich you will need: \n");
    System.out.printf("%.2f Kgs of cheese\n", 2 * (0.05 * qntSandwich));
    System.out.printf("%.2f Kgs of ham\n", (0.05 * qntSandwich));
    System.out.printf("%.2f Kgs of hamburger meat\n", (0.12 * qntSandwich));

    input.close();
  }
}