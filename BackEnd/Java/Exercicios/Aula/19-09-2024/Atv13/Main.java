import java.util.Scanner;

/*
 * Faça um Programa que solicite um dia, um mês 
 * e um ano e determine se estes números forma
 *  uma data válida. Não utilize nenhuma biblioteca
 *  adicional do Java para isto. Faça apenas 
 * utilizando estrutruas de decisão. Pesquise como
 *  identificar se um ano é um número bisexto.
 */
//grupo = 6

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;
        boolean isBisexto, isValid = true;

        System.out.print("Digite o dia: ");
        dia = input.nextInt();
        System.out.print("Digite o mes: ");
        mes = input.nextInt();
        System.out.print("Digite o ano: ");
        ano = input.nextInt();
        
        if(dia < 0 || mes < 0 || ano < 0 || dia > 31 || mes > 12){
            isValid = false;
        }
        else{
            isBisexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia > 31){
                    isValid = false;
                }
            }
            else{
                if(mes == 2 && isBisexto && dia > 29){
                    if(isBisexto){
                        
                    }
                    isValid = false;
                }
                else if(mes == 2 && !isBisexto && dia > 28){
                    isValid = false;
                }
                else if(dia > 30){
                    isValid = false;
                }
            }   
        }

        System.out.printf("A data %d/%d/%d é ", dia, mes, ano);
        if(isValid)
            System.out.println("válido");
        else
            System.out.println("inválido");

        input.close();
    }
}
