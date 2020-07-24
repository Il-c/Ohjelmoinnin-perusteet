
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int kertoma = 1;
        System.out.print("Anna luku: ");
        int syote = Integer.valueOf(lukija.nextLine());
        for (int laskuri = 1;laskuri<=syote; laskuri ++) {
            kertoma=kertoma*laskuri;
            
        }
        System.out.println("Kertoma on "+kertoma);
    }
}
