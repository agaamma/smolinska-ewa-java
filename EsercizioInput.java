import java.util.Scanner;
public class EsercizioInput {
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un nome: ");
        String nome = tastiera.nextLine();
        System.out.println("Ciao " + nome);
        System.out.print("Inserisci tuo cognome: ");
        String cognome = tastiera.nextLine();
//concatenzaione di stringhe
        System.out.println("Ciao " + nome + cognome);
        System.out.print("Inserisci tua eta: ");
//zamiana zmiennej tekstowej na numeryczna, czyli cast
        int eta = Integer.parseInt(tastiera.nextLine());
        eta = eta *2; 
        System.out.println("Ciao " + nome + cognome + " tua eta:" + eta);
//zmiana systemu na numeryczny, pojedyncze symbole maja swoje numery, 
//ta zmiana nazywa sie CAST
        double n1 = (double)a;
        char c = 'A';
        int n2 = (int)c;
//jak robic operacje na string z lungeza

    }
}