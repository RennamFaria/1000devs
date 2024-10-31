//10-O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar
//uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2

//Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo
//com a tabela abaixo.
//IMC em adultos Condição
//Abaixo de 18,5 Abaixo do peso
//Entre 18,5 e 25 Peso normal
//Entre 25 e 30 Acima do peso
//Acima de 30 obeso 
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float peso=0, altura=0;
        float imc=0;

        System.out.print("Digite a altura em metros: ");
        try{
            altura = teclado.nextFloat();
        }catch(Exception e){}

        System.out.print("Digite o peso em kgs: ");
        try{
            peso = teclado.nextFloat();
        }catch(Exception e){}

        imc = peso / (altura * altura);

        String mensagem = imc >= 30
        ?"Seu IMC %.2f lhe classifica como obeso.\n"
        :imc >= 25
        ?"Seu IMC %.2f lhe classifica como acima do peso.\n"
        :imc >= 18.5f
        ?"Seu IMC %.2f lhe classifica como peso normal.\n"
        :"Seu IMC %.2f lhe classifica abaixo do peso normal.\n";

        System.out.printf(mensagem, imc);

        teclado.close();
    }
}