/* Crea un programma Java che calcoli la distanza tra due punti nel piano cartesiano. 
Le coordinate dei punti (x1, y1) e (x2, y2) verranno fornite dall'utente. Il programma dovrà:

    Chiedere all'utente di inserire le coordinate dei due punti.
    Calcolare la distanza usando la formula: distanza = sqrt((x2 - x1)^2 + (y2 - y1)^2).
    Stampare la distanza calcolata. 
    Ricorda di usare Math.sqrt per la radice quadrata e Math.pow per elevare a potenza, con variabili double.
*/

import java.util.Scanner;
public class Esercizio3 {
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci valore x1");
        double x1 = Double.parseDouble(tastiera.nextLine());
        System.out.print("Inserisci valore y1");
        double y1 = Double.parseDouble(tastiera.nextLine());
        System.out.print("Inserisci valore x2");
        double x2 = Double.parseDouble(tastiera.nextLine());
        System.out.print("Inserisci valore y2");
        double y2 = Double.parseDouble(tastiera.nextLine());

        double DIS = 1; // przypadkowa wartosc, aby nie bylo bledu

        boolean Cghiaccio = TC< 0;
        boolean Caqua = TC >= 0 && TC <100;
        boolean Cvapore = TC > 100;

        System.out.println("Temperatura in Celsius: " + TC);

        if (Cghiaccio){
            System.out.println("stato: ghiaccio");
        }
        else if(Caqua){
            System.out.println("stato: aqua");
        }
        else if (Cvapore){
            System.out.println("stato: vapore");
        }
    }
} 