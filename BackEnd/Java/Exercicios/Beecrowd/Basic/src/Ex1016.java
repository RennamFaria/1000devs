import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int distance, time;

        distance = input.nextInt();

        time = distance * 2;

        System.out.println(time + " minutos");

        input.close();
    }
}
