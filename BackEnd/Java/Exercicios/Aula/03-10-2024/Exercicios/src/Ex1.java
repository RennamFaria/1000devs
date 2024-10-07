//sala 6

//3-Faça um algoritmo para receber um número qualquer e 
//informar na tela se é par ou ímpar.
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado;
        int valor=0;
        boolean ehImpar;

        teclado = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        
        try{
            valor = teclado.nextInt();
        }catch(Exception e){
        }

        ehImpar = (valor % 2 != 0);

        String menssagem = ehImpar == true
            ?"O número é ímpar."
            :"O número " + valor + " é par.";

        System.out.println(menssagem);

        teclado.close();
    }
}