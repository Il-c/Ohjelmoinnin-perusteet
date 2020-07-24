
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");
        System.out.print("Mitä etsitään? ");
        int kohde = Integer.valueOf(lukija.nextLine());
        for (int laskuri = 0; laskuri < lista.size();laskuri++){
            if (lista.get(laskuri)==kohde){
                System.out.println("Luku "+kohde+" on indeksissä "+laskuri);
                
            }
        }

    }
}
