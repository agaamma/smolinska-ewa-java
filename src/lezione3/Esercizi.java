package src.lezione3;
import java.util.Scanner;
public class Esercizi {
     /*
    Es1: (if-else-Scanner) Chiedere un numero e stampare "Pari" o "dispari"
    Es2: (for) Chiedere quante temperature si vuole inserire
    stampare il minimo, massimo e la media (senza array).
    Es3: (for - ArrayList) salvare le temperature precedenti
    stampare quelle maggiori di 10 gradi
    Es4: (while) chiedere all'utente dei numeri e sommarli finché
    non scrive 0 (terminare quando inserisce 0)
    Es5: (String, substring) stampare il proprio nome al contrario
    * */
     public static void main(String[] args) {
         Scanner tastiera = new Scanner(System.in);
        /* System.out.print("Inserisci un numero");
         double numero = Double.parseDouble(tastiera.nextLine());
         boolean pari = numero % 2 ==0;
         if (pari) {
             System.out.println("numero e pari");
         }
         else {
             System.out.println("numero dispari");
     }*/
         System.out.print("Quante temperature vuoi inserire?");
         int n = Integer.parseInt(tastiera.nextLine());
         int i= 1;
         int min = 0;
         int max = 0;
         int avg = 0;
         int t = 0;
         //int [] tem = new int [n];
         //while (i<=n){
         for(i=1;i<=n;i++){
            t = Integer.parseInt(tastiera.nextLine());
            avg+=t; // avg=avg+t;
            if (i == 1) {
                min = t;
                max = t;
            }
            else{
               if (min>t){min=t;}
               if (max<t){max=t;}
            }
           // if (t >10) {tem[i]= t;}
                //i++;
         }
         avg=avg/n;
         System.out.println("temp media: " + avg);
         System.out.println("temp massima: " + max);
         System.out.println("temp minima: " + min);
         }

}
