package src.lezione4;
import java.util.Scanner;
public class es2_di4 {
    public static void main(String[] args) {
        //(if-else): Chiedere all'utente un numero. Stampare il doppio se è pari, la metà se è dispari
        Scanner tastiera = new Scanner(System.in);
        System.out.print("inserisci numero con virgola");
        int n = Integer.parseInt(tastiera.nextLine());
        if (n%2==0) {
            System.out.println(n*2);
        }
        else {
            System.out.println(n/2);
        }
    }
}
