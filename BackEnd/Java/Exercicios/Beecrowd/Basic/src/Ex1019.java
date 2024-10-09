import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int seconds, hours = 0, minutes = 0;

        seconds = input.nextInt();

        while(seconds >= 3600){
            seconds = seconds - 3600;
            hours++;
        }
        while(seconds >= 60){
            seconds = seconds - 60;
            minutes++;
        }

        System.out.println(hours + ":" + minutes + ":" + seconds);


        input.close();
    }
}
