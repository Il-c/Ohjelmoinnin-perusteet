
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote!=0) {
                summa = summa+syote;
            }else{
                System.out.println("Lukujen summa "+summa);
                break;
            }
        }
    }
}
