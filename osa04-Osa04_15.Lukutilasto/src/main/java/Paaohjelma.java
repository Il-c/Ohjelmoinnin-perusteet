
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto pariTilasto = new Lukutilasto();
        Lukutilasto paritonTilasto = new Lukutilasto();
        
        System.out.println("Anna lukuja:");
        int syote = 0;
        while (true){
            syote = Integer.valueOf(lukija.nextLine());
            if (syote != -1){
                tilasto.lisaaLuku(syote);
                if (syote%2==0){
                    pariTilasto.lisaaLuku(syote);
                }else{
                    paritonTilasto.lisaaLuku(syote);
                }
            }else{
                break;
            } 
        }
        System.out.println("Summa: "+tilasto.summa());
        System.out.println("Parillisten summa: "+pariTilasto.summa());
        System.out.println("Parittomien summa: "+paritonTilasto.summa());
        

        
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
    }
}
