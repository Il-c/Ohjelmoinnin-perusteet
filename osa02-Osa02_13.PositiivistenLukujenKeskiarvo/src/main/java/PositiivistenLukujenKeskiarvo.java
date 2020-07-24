
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int lukumaara = 0;
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote!=0) {
                if (syote>0){
                    summa = summa+syote;
                    lukumaara++;
                }
            }else if (lukumaara>0){
                System.out.println("Lukujen keskiarvo "+((double)summa/(double)lukumaara));
                break;
            }else if (lukumaara == 0){
                System.out.println("keskiarvon laskeminen ei ole mahdollista");
                break;
            }
        }
    }
}
