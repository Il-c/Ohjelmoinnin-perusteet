
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote>0) {
                System.out.println(syote*syote);
            }else if (syote<0){
                System.out.println("Epäkelpo luku");
            }else{
                break;
            }
        }
    }
}
