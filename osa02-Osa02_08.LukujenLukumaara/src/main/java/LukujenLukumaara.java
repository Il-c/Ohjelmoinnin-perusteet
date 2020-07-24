
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukujenMaara = 0;
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote!=0) {
                lukujenMaara++;
            }else{
                System.out.println("Lukuja yhteensä "+lukujenMaara);
                break;
            }
        }
    }
}
