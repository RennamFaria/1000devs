import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1, n2, n3, n4, avg, examNote;

        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();
        n4 = scanner.nextFloat();

        avg = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        System.out.printf("Media: %.1f%n", avg);

        if (avg >= 7.0) {
            System.out.println("Aluno aprovado.");
        } 
        else if (avg < 5.0) {
            System.out.println("Aluno reprovado.");
        } 
        else {
            System.out.println("Aluno em exame.");
            
            examNote = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", examNote);
            
            avg = (avg + examNote) / 2;
            
            if (avg >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", avg);
        }

        scanner.close();
    }
}
