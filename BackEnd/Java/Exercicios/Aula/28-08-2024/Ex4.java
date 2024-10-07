/*
Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. Após o aumento, desconte 11% de INSS e 8% de FGTS. Imprima o salário inicial, o salário com o aumento, o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos (INSS+FGTS).
*/

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float salary, finalSalary, inssDisc, fgtsDisc, totalDisc;

    System.out.print("Inform the salary: ");
    salary = input.nextFloat();

    System.out.printf("Inicial salary: %.2f\n", salary);

    salary = salary + (salary * 0.15f);
    //or do in this way (salary *  (float) 0.15);
    //becase of standard of Java he think the 0.15 is Double instead of Float, so need to change
    inssDisc = salary * 0.11f;
    fgtsDisc = salary * 0.08f;
    totalDisc = inssDisc + fgtsDisc;
    finalSalary = salary - totalDisc;

    System.out.printf("\nReajust salary: %.2f\n", salary);
    System.out.printf("Discount of INSS: %.2f\n", inssDisc);
    System.out.printf("Discount of FGTS: %.2f\n", fgtsDisc);
    System.out.printf("Total discount: %.2f\n", totalDisc);
    System.out.printf("Finals salary is: %.2f\n\n", finalSalary);

    input.close();
  }
}