/* Scrivi un programma Java che utilizza la classe Scanner
per prendere due numeri in input dall'utente.
Il programma poi chiede all'utente di scegliere un'operazione
matematica da eseguire tra i due numeri
(addizione, sottrazione, moltiplicazione, divisione, modulo).
Il programma calcola il risultato dell'operazione scelta e
 lo stampa a schermo.*/

import java.util.Scanner;
public class EsercizioInput {
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un numero:");
        int n1 = Integer.parseInt(tastiera.nextLine());
        System.out.print("Inserisci un altro numero:");
        int n2 = Integer.parseInt(tastiera.nextLine());
        System.out.print("Scegliere un'operazione fra: addizione, sottrazione, moltiplicazione, divisione");
        String operazione = tastiera.nextLine();
        boolean condizioneAdd = operazione.equals("addizione");
        boolean condizioneSot = operazione.equals("sottrazione");
        boolean condizioneMol = operazione.equals("moltiplicazion");
        boolean condizioneDiv = operazione.equals("divisione");
        int addizione = n1 + n2;
        int sottrazione = n1 - n2;
        int moltiplicazione = n1 * n2;
        int divisione = n1/n2;
        if (condizioneAdd){
            System.out.println(addizione);
        }
        else if(condizioneSot){
            System.out.println(sottrazione);
        }
        else if(condizioneMol){
            System.out.println(moltiplicazione);
        }
        else if n2!=0 (condizioneDiv){
            System.out.println(divisione);
        }
        else {
            System.out.println("operazione impossibile");
        }
    }
} 

