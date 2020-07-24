
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Mihin asti? ");
        int mihin = Integer.valueOf(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int mista = Integer.valueOf(lukija.nextLine());
        
        for (int laskuri = mista;laskuri<=mihin; laskuri ++) {
            System.out.println(laskuri);
            
        }
    }
}
