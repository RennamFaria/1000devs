import java.util.Scanner;
 
public class Ex1010 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int id, qntProducts;
        double price, total;

        total = 0f;

        for(int i = 0; i < 2; i++){
            id = input.nextInt();

            qntProducts = input.nextInt();

            price = input.nextFloat();

            total = total + (price * qntProducts);
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
        input.close();
    }
}
