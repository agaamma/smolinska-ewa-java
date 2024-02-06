package lezione2.riscaldamento;
import java.util.Scanner;
public class Es1 {
    //wystarczy main
    public static void main(String[] args){
        /*definjujemy tastiere*/
        Scanner tastiera = new Scanner(System.in);
        /*definujemy dwa numery z opcja typu prompt oraz prompt skrotem sout*/
        System.out.print("inserisci numero");
        int n1 = Integer.parseInt(tastiera.nextLine());
        System.out.print("inserici numero");
        int n2 = Integer.parseInt(tastiera.nextLine());
        int somma = n1 + n2;
        System.out.println("la somma:" + somma);
    }
}
