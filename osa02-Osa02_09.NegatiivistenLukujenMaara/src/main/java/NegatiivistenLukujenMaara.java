
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukujenMaara = 0;
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote<0) {
                lukujenMaara++;
            }else if(syote==0){
                System.out.println("Negatiivisia lukuja yhteensä "+lukujenMaara);
                break;
            }
        }
    }
}
