package lezione3;
import java.util.Scanner;
public class Esercizi {
    public static void main(String[] args) {
      //  Es1: (if-else-Scanner) Chiedere un numero e stampare "Pari" o "dispari"
       Scanner tastiera = new Scanner(System.in);
       System.out.print("Inserisci un numero:");
       int n1 = Integer.parseInt(tastiera.nextLine());
       boolean condizione = n1%2 ==0;
    }
}
