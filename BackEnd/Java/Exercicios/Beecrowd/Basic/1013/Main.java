import java.util.Scanner; 

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:BackEnd/Java/Exercicios/Beecrowd/Basic/src/Ex1013.java
public class Ex1013{
    public void ex1013() {
=======
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
=======
>>>>>>> parent of 4bd71d8 (Reorganization of codes)
public class Main {
    public static void main(String[] args){
>>>>>>> parent of 4bd71d8 (Reorganization of codes):BackEnd/Java/Exercicios/Beecrowd/Basic/1013/Main.java
        Scanner input = new Scanner(System.in);
        int a, b, c, total;

        a = input.nextInt();

        b = input.nextInt();

        c = input.nextInt();

        total = (a + b + Math.abs(a-b))/2;

        if(total > c)
            System.out.print(total);
        else
            System.out.print(c);

        System.out.println(" eh o maior");

        input.close();
    }
}
