import java.util.Scanner;

/*
 *  Faça um Programa que leia um número inteiro menor que 1000 
 * e imprima a quantidade de centenas, dezenas e unidades do
 *  mesmo. Observando os termos no plural a colocação do "e", 
 * da vírgula entre outros. Exemplo:


    326 = 3 centenas, 2 dezenas e 6 unidades
    12 = 1 dezena e 2 unidades 
    Testar com: 326, 300, 100, 
    320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16



 */
//grupo = 6

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numb, centena = 0, dezena = 0, unidade = 0;

        numb = input.nextInt();

        centena = numb / 100;
        dezena = (numb % 100) / 10;
        unidade = ((numb % 100) % 10);

        System.out.print(numb + " = ");
        if(centena != 0)
            System.out.print(centena + " centenas, ");
        if(dezena != 0)
            System.out.print(dezena + " dezenas e ");

        System.out.println(unidade + " unidades");

        input.close();

    }
}
