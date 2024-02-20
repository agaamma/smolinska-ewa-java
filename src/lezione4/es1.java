package src.lezione4;
import java.util.Scanner;
public class es1 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("inserisci numero con virgola");
        double n1 = Double.parseDouble(tastiera.nextLine());
        System.out.print("inserisci altro numero con virgola");
        double n2 = Double.parseDouble(tastiera.nextLine());
        double sum = n1 + n2;
        System.out.println("somma di numeri e" + sum);

    }

}
