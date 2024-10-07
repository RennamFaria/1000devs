import java.util.Scanner;

public class ExInClass{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double a, b, c;
    double trRetangulo, circulo, trapezio, quadrado, retangulo;

    a = input.nextFloat();

    b = input.nextFloat();

    c = input.nextFloat();

    trRetangulo = (a*c)/2;
    circulo = (3.14159 * (c * c));
    trapezio = ((a + b) * c) / 2;
    quadrado = (b * b);
    retangulo = a * b;

    System.out.printf("TRIANGULO: %.3f", trRetangulo);
    System.out.printf("\nCIRCULO: %.3f", circulo);
    System.out.printf("\nTRAPEZIO: %.3f", trapezio);
    System.out.printf("\nQUADRADO: %.3f", quadrado);
    System.out.printf("\nRETANGULO: %.3f\n", retangulo);

    input.close();
  }
}