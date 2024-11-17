import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);     
        
        String nomes[] = new String[400];
        int numeroDeps[] = new int[400];
        float salarios[] = new float[400];

        int ultimaPosicaoGravada = 0 ;

        int mediaSalario = 0;
        int mediaDependentes = 0;

        //[0] index do nome; [1] a quantidade de dependentes
        int menorQuantDependentes[] = {0, 9999};
        //[0] index do nome; [1] a quantidade de salario
        float maiorQuantSalario[] = {0, 0};
        
        //variavel para guardar a resposta do 
        //usuario se ele deseja digitar os dados
        //de um novo habitante
        char resposta; 

        //leitura dos habitantes e gravacao na memoria (vetores)
        for (int posicaoVetor = 0; posicaoVetor < 400; posicaoVetor++) {
    
            nomes = lerNome(teclado, nomes, posicaoVetor);
            salarios = lerSalario(teclado, salarios, posicaoVetor);
            numeroDeps = lerDependentes(teclado, numeroDeps, posicaoVetor);

            System.out.print("\nDeseja entrar com dados do próximo habitante [s/n]: ");
            resposta = teclado.nextLine().toLowerCase().charAt(0);

            if(menorQuantDependentes[1] > numeroDeps[posicaoVetor]){
                menorQuantDependentes[0] = posicaoVetor;
                menorQuantDependentes[1] = numeroDeps[posicaoVetor];
            }
            if(maiorQuantSalario[1] < salarios[posicaoVetor]){
                maiorQuantSalario[0] = posicaoVetor;
                maiorQuantSalario[1] = salarios[posicaoVetor];
            }
            
            if (resposta == 'n'){
                ultimaPosicaoGravada = posicaoVetor;               
                break;
            }
        }

        for(int posicaoVetor = 0; posicaoVetor < ultimaPosicaoGravada; posicaoVetor++){
            mediaSalario += salarios[posicaoVetor];
            mediaDependentes += numeroDeps[posicaoVetor];
        }

        mediaSalario = mediaSalario / (ultimaPosicaoGravada+1);
        mediaDependentes = mediaDependentes / (ultimaPosicaoGravada+1);

        int temporary = (int)(Math.round(maiorQuantSalario[0]));

        imprimirDados(nomes, salarios, numeroDeps, ultimaPosicaoGravada, mediaSalario, 
        mediaDependentes, nomes[menorQuantDependentes[0]], menorQuantDependentes[1], nomes[temporary], 
        maiorQuantSalario[1]);

        teclado.close();
    }

    static void imprimirDados(String nomes[], float salarios[], int numeroDeps[],
     int ultimaPosicaoGravada, int mediaSalario, int mediaDependentes, String menorQuantDependentesNome,
     int menorQuantDependentesValor, String maiorQuantSalarioNome, float maiorQuantSalarioValor){
        //acessando os dados para imprimir na tela
        int qtdeEspacos;
        System.out.println("\nNome                Salario                QtdeDependentes");
        System.out.println("----------------------------------------------------------");
        
        for (int posicaoVetor = 0; posicaoVetor <= ultimaPosicaoGravada; posicaoVetor++) {
            System.out.print(nomes[posicaoVetor]);
            
            qtdeEspacos = (20 - nomes[posicaoVetor].length());

            System.out.print(geraEspacos(qtdeEspacos));

            System.out.print("R$ " + salarios[posicaoVetor]);

            qtdeEspacos = (20 - Float.toString(salarios[posicaoVetor]).length());

            System.out.print(geraEspacos(qtdeEspacos));

            System.out.println(numeroDeps[posicaoVetor]);
        }

        System.out.println();
        System.out.println("A média dos salarios dos habitantes: R$ " + mediaSalario);
        System.out.println("A média de dependentes: " + mediaDependentes);

        System.out.println();
        System.out.println("Habitante com a menor quantidade de dependentes: " + menorQuantDependentesNome);
        System.out.println("Quantidade de dependentes do " + menorQuantDependentesNome +": " + menorQuantDependentesValor);

        System.out.println();
        System.out.println("Nome do habitante com maior salário: " + maiorQuantSalarioNome);
        System.out.println("Valor do salário do " + maiorQuantSalarioNome + ": " + maiorQuantSalarioValor);
    }

    static String geraEspacos(int qtde){
        String espacos = "";

        for (int i = 0; i < qtde; i++) {
            espacos += " ";
        }

        return espacos;
    }

    static String[] lerNome(Scanner teclado, String nomes[], int posicaoLivre){
        System.out.print("Digite o nome do habitante: ");
        nomes[posicaoLivre] = teclado.nextLine(); 
        return nomes;
    }

    static float[] lerSalario(Scanner teclado, float salarios[], int posicaoLivre){
        System.out.print("Digite o salario R$: ");
        salarios[posicaoLivre] = teclado.nextFloat(); 
        
        //resolve o problema da limpeza do buffer
        teclado.nextLine();

        return salarios;
    }

    static int[] lerDependentes(Scanner teclado, int numeroDeps[], int posicaoLivre){
        System.out.print("Digite a quantidade de dependentes: ");
        numeroDeps[posicaoLivre] = teclado.nextInt(); 

        //resolve o problema da limpeza do buffer
        teclado.nextLine();
        
        return numeroDeps;
    }
     
}