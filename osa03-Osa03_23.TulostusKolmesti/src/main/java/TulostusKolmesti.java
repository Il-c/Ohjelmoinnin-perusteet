
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mikä tulostetaan? ");
        String sana = lukija.nextLine();
        String lause = sana+sana+sana;
        System.out.println(lause);
        
    }
}
