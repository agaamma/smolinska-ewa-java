package lezione2.riscaldamento;
import java.util.Scanner;
public class Es2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci un nome");
        String nome = tastiera.nextLine();
        System.out.println(nome.substring(0,1));
        System.out.println(nome.substring(nome.length()-1));
    }
}
