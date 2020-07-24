
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int lukumaara = 0;
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote!=0) {
                summa = summa+syote;
                lukumaara++;
            }else{
                System.out.println("Lukuja yhteensä "+lukumaara);
                System.out.println("Lukujen summa "+summa);
                break;
            }
        }
    }
}
