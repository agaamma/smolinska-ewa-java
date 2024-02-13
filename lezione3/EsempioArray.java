package lezione3;

import java.util.ArrayList;
import java.util.List;
public class EsempioArray {
    public static void main(String[] args) {
        List<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        System.out.println();
        System.out.println(numeri.get(0));
        //ten powyzej stampa konkretny numer indice
        numeri.remove(1);
        //ten powyzej usuwa index numer indexu on sam
        System.out.println(numeri);
        System.out.println(numeri.size());
        //ten powyzej dlugosc array ci liczy
        //numeri.subList();
        //sublist to cos na ksztalt slice w java script
    }
}
