import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Esercizio5 {
    public static void main(String[] args) {
        new Scanner(System.in);
        List<Integer> numeri = new ArrayList();

        for(int i = 0; i < 15; ++i) {
            numeri.add(i + 1);
        }

        System.out.println(numeri);
        numeri.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

    }
}
