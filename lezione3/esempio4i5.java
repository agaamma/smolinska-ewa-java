package lezione3;
import java.util.Scanner;
public class esempio4i5 {
    public static void main(String[] args) {
        /*Es4: (while) chiedere all'utente dei numeri e sommarli finché
        non scrive 0 (terminare quando inserisce 0)

        Es5: (String, substring) stampare il proprio nome al contrario*/

        Scanner tastiera = new Scanner(System.in);
        int n = Integer.parseInt(tastiera.nextLine());
        int n2 = Integer.parseInt(tastiera.nextLine());
        int sum = n+n2;
        while (n!=0){
            n2 = Integer.parseInt(tastiera.nextLine());
            System.out.println("Somma:" + sum);

        }
    }
}
