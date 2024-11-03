import java.util.Scanner;

// Faça um algoritmo que lê vários valores inteiros. Após a leitura de um valor o usuário responde se deseja
// digitar um novo valor. Após a leitura dos valores apresente a média dos valores pares e a média dos valores
// ímpares.

public class Ex7 {
    public Ex7() {
        Scanner input = new Scanner (System.in);
        int value, evenNumbers = 0, countEven = 0, oddNumbers = 0, countOdd = 0;
        char condition;

        do{
            System.out.println("Type a number: ");
            value = input.nextInt();
            
            if((value % 2) ==  0){
                evenNumbers += value;
                countEven++;
            }
            else if((value % 2) == 1){
                oddNumbers += value;
                countOdd++;
            }

            do{
                System.out.println("You desire to type another value? ('s' or 'n')");
                condition = input.next().charAt(0);
                if(condition == 's' || condition == 'n'){
                    break;
                }
                else{
                    System.out.println("--You type the wrong character, type again, please.--");
                }
            }while(true);      //make the loop infinite unitl he type 's' or 'n'

        }while(condition != 'n');

        System.out.println();

        System.out.println("The mean of the numbers of each, even and odd, that you type are:");
        System.out.println((evenNumbers / countEven) + " even number(s)");
        System.out.println((oddNumbers / countOdd) + " odd number(s)");
        
        input.close();
    }
}
