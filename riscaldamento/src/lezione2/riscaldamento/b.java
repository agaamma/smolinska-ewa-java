package lezione2.riscaldamento;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        //eta maggiorenne true of false
        Scanner tastiera = new Scanner(System.in);
        int eta = Integer.parseInt(tastiera.nextLine());
        boolean condizione = eta >= 18;
        System.out.println(condizione);
        */

        //stampare true se fra 0 e 5
        /* int insuf = Integer.parseInt(tastiera.nextLine());
        boolean condizione2 = insuf <= 5 && insuf >=0;
        System.out.println(condizione2);
        */

        // numero e pari oppure no
        /* int pari = Integer.parseInt(tastiera.nextLine());
        boolean condizione3 = pari % 2 == 0;
        System.out.println(condizione3);

        int anno = Integer.parseInt(tastiera.nextLine());
        boolean condizione4 = anno %4 == 0 && !(anno % 100 == 0) || anno % 400 == 0;
        System.out.println(condizione4);
        */
        System.out.println("inserisci un password");
        String nomeUtente = tastiera.nextLine();
        String password = tastiera.nextLine();
        boolean condizione = nomeUtente.equals("utente") && password.equals("password");
        System.out.println(condizione);
        if(condizione){
            System.out.println("messaggio segreto");
        }else if(condizione){
            System.out.println("user error");
        }else{
            System.out.println("ciao");
        }
    }
}
