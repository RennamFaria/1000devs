import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int days, year = 0, month = 0;

        days = input.nextInt();

        year = days / 365;
        days = days - (365 * year);

        month = days / 30;
        days = days - (30 * month);

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(days + " dia(s)");

        input.close();
    }
}