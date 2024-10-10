import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1019.java
public class Ex1019 {
    public void ex1019() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1019/Main.java
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
