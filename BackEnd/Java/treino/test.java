package treino;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int i;

        System.out.println("Type a name: ");
        name = scanner.next();  //the next with nothing is as normal "String"
        //if you wanna to specify the type of the code need to use more
        //like nextInt, nextFloat, etc

        System.out.println(name);

        i = scanner.nextInt();
        System.out.println(i);

        scanner.close();
    }
}