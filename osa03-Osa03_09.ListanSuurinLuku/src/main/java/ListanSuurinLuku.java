
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

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
        int suurin = 0;
        for (int laskuri = 0; laskuri < lista.size();laskuri++){
            if (lista.get(laskuri)>suurin){
                suurin=lista.get(laskuri);
            }
        }
        System.out.println("Listan suurin luku: "+suurin);
    }
}
