/*
Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
*/

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float salaryMin, salary, qntMinSalary;

    System.out.println("Type the minimun salary: ");
    salaryMin = input.nextFloat();
    input.nextLine();  // Clean buffer

    System.out.println("Type your salary: ");
    salary = input.nextFloat();

    qntMinSalary = (salary / salaryMin);

    System.out.printf("You recive %,.2f salary Minimum.\n", qntMinSalary);

    input.close();
  }
}