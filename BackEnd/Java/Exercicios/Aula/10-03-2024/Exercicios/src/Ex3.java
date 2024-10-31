
//7-Faça um algoritmo que leia uma variável e some 5 
//caso seja par ou some 8 caso seja ímpar,
//imprimir o resultado desta operação.

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner teclado;
        int valor=0, resultado;
        boolean ehImpar;

        teclado = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        try{
            valor = teclado.nextInt();
        }catch(Exception e){}

        ehImpar = (valor % 2 != 0);

        resultado = ehImpar == true
            ?valor + 8
            :valor + 5;

        System.out.println("Resultado: " + resultado);

        teclado.close();
    }
}

