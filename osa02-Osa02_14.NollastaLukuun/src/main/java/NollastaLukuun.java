
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int syote = Integer.valueOf(lukija.nextLine());
        for (int laskuri = 0;laskuri<=syote; laskuri ++) {
            System.out.println(laskuri);
            
        }
    }
}
