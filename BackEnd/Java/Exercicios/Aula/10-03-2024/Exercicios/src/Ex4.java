//5-Encontrar o dobro de um número caso ele seja positivo 
//e o seu triplo caso seja negativo, imprimindo o resultado. 
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner teclado;
        int valor=0, resultado = 0;

        teclado = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        try{
            valor = teclado.nextInt();
        }catch(Exception e){}

        // negativo
        resultado = valor < 0
        ?valor * 3
        :valor * 2;

        if (resultado != 0) {
            System.out.println("Resultado: " + resultado);
        }

        teclado.close();
    }
}