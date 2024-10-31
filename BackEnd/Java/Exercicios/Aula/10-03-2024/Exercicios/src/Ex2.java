import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado;
        int a=0, b=0;
        int c=0;

        teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        try{
            a = teclado.nextInt();
        }catch(Exception e){}

        System.out.print("Digite o segundo valor: ");
        try{
            b = teclado.nextInt();
        }catch(Exception e){}

        System.out.print("Digite o terceiro valor: ");
        try{
            c = teclado.nextInt();
        }catch(Exception e){}

        String mensagem = (a + b) < c
            ?"A soma de A + B é menor C"
            :"A soma de A + B não é menor C";

        System.out.println(mensagem);

        teclado.close();
    }
}
