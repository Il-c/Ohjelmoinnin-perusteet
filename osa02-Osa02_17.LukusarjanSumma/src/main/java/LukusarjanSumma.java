
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        System.out.print("Ensimmäinen: ");
        int ensimmainen = Integer.valueOf(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int viimeinen = Integer.valueOf(lukija.nextLine());
        
        for (int laskuri = ensimmainen;laskuri<=viimeinen; laskuri ++) {
            summa = summa+laskuri;
        }
        System.out.println("Summa on "+summa);
    }
}
