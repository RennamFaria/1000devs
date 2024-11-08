import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorteado;
        int escolhaComputador;
        int escolhaJogador;

        int contadorVitoria = 0;
        int contadorDerrota = 0;

        char condicao;
        String resultado;

        do{
            numeroSorteado = random.nextInt(1,90);
     
            if (numeroSorteado >= 61)
                escolhaComputador = 3;
            else if (numeroSorteado >= 31) 
                escolhaComputador = 2;
            else 
                escolhaComputador = 1;
            
            //papel = 1
            //pedra = 2
            //tesoura = 3
    
            //papel ganha de pedra
            //pedra ganha de tesoura
            //tesoura ganha de papel
            //empates
    
            System.out.println("Jogo Pedra/Papel/Tesoura: ");
            System.out.println("\n1 - papel ");
            System.out.println("2 - pedra ");
            System.out.println("3 - tesoura ");
            System.out.print("\nDigite uma das opções: ");
    
            escolhaJogador = input.nextInt();
    
            if (escolhaComputador == 1 && escolhaJogador == 2) {
                resultado = "Computador ganhou";
                contadorDerrota++;
            }
            else if (escolhaComputador == 2 && escolhaJogador == 1){
                resultado = "Você ganhou";
                contadorVitoria++;
            }
            else if (escolhaComputador == 3 && escolhaJogador == 2) {
                resultado = "Você ganhou";
                contadorVitoria++;
            }
            else if (escolhaComputador == 2 && escolhaJogador == 3){
                resultado = "Computador ganhou";
                contadorDerrota++;
            }
            else if (escolhaComputador == 1 && escolhaJogador == 3) {
                resultado = "Você ganhou";
                contadorVitoria++;
            }
            else if (escolhaComputador == 3 && escolhaJogador == 1) {
                resultado = "Computador ganhou";
                contadorDerrota++;
            }
            else 
                resultado = "Empate";
    
            System.out.println("\nComputador escolheu: " + devolveEscolha(escolhaComputador));
            System.out.println("Usuário escolheu: " + devolveEscolha(escolhaJogador));
    
            System.out.println("\nResultado: " + resultado);

            do{
                System.out.print("\nVocê deseja jogar mais uma vez? (s ou n)");
                condicao = input.next().charAt(0);
                if(condicao == 's' || condicao == 'n'){
                    break;
                }
                else{
                    System.out.println("--Você digitou a letra errada--");
                }
            }while(true);

            System.out.print("\n---------------------------");
            System.out.print("\nPlacar da partida:\n");
            System.out.println("Você X Computador");
            System.out.printf("  %d\t%d\n", contadorVitoria, contadorDerrota);
            System.out.print("---------------------------\n");

        }while(condicao != 'n');

        System.out.print("\nTerminando partida");


        input.close();
    }  
    
    static String devolveEscolha(int escolha){
        switch (escolha) {
            case 1:
                return "papel";
            case 2:
                return "pedra";
            default:
                return "tesoura";
        }
    }
            
}