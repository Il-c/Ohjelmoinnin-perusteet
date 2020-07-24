
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String merkkijono = lukija.nextLine();
        while (!merkkijono.isEmpty()){
            String[] palat = merkkijono.split(" ");
            for (int laskuri = 0;laskuri<palat.length;laskuri++){
                if (palat[laskuri].contains("av")){
                    System.out.println(palat[laskuri]);
                }
            }
            merkkijono=lukija.nextLine();
            
        }

    }
}
