import java.util.Scanner;

// A prefeitura de uma cidade precisa fazer uma pesquisa entre seus habitantes, coletando dados sobre o salário
// e número de filhos.

// O algoritmo deve ler os dados de vários habitantes. Após a leitura dos dados de um habitante o usuário responde
// se ele deseja inserir os dados s ou n de um novo habitante. A prefeitura deseja saber:

// a) média do salário da população;
// b) média do número de filhos;
// c) maior salário;
// d) percentual de pessoas com salário até R$ 1000,00.

public class Ex10 {
    public Ex10() {
        Scanner input = new Scanner(System.in);
        float salary, meanSalary = 0, maxSalary = 0, countSalaryUntil1k = 0;
        int sons, meanSon = 0, counter = 0;
        char condition;

        do{
            System.out.println("For the habitant " + counter + " type the salary: ");
            salary = input.nextFloat();

            System.out.println("Number of son(s)");
            sons = input.nextInt();
            
            meanSalary += salary;
            meanSon += sons;

            if(salary > maxSalary){
                maxSalary = salary;
            }

            if(salary <= 1000.00){
                countSalaryUntil1k++;
            }

            do{
                System.out.println("You desire to type a new habitant stats? ('s' or 'n')");
                condition = input.next().charAt(0);
                if(condition == 's' || condition == 'n'){
                    break;
                }
                else{
                    System.out.println("--You type the wrong character, type again, please.--");
                }

                counter++;
            }while(true);      //make the loop infinite unitl he type 's' or 'n'

        }while(condition != 'n');

        System.out.println("The total data of " + counter + "habitants digited is of: ");
        System.out.println((meanSalary/counter) + " -> mean salary of the habitants");
        System.out.println((meanSon/counter) + " -> mean son of the habitants");
        System.out.println(maxSalary + " -> the biggest salary of the habitants");
        System.out.println(((countSalaryUntil1k/counter) * 100) + "% -> is the percentual of habitants with salary less then R$1000.00");


        input.close();
    }
}
