/* Scrivi un programma Java che permetta all'utente di convertire una temperatura da Fahrenheit a Celsius.
Il programma dovrà:
Chiedere all'utente di inserire una temperatura in Fahrenheit.
Convertire la temperatura in Celsius usando la formula: C = (F - 32) * 5/9.
Stampare il risultato.
Utilizzare Scanner per l'input, e variabili di tipo double per le temperature.
- dire nel caso dell'acqua se con quella temperatura
sarebbe ghiaccio, acqua o vapore*/

import java.util.Scanner;
public class EsercizioInput {
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci una temperatura in Fahrenheit");
        double TF = Double.parseDouble(tastiera.nextLine());
        double TC = (TF - 32) * (5/9);

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