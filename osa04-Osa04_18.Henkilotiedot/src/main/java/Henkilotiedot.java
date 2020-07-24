
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true){
            System.out.print("Etunimi: ");
            String etuNimi = lukija.nextLine();
            if (etuNimi.isEmpty()){
                break;
            }
            System.out.print("Sukunimi: ");
            String sukuNimi = lukija.nextLine();
            
            System.out.print("Henkilötunnus: ");
            String hetu = lukija.nextLine();
            
            henkilotiedot.add(new Henkilotieto(etuNimi,sukuNimi,hetu));
        }
        System.out.println("");
        for (Henkilotieto heti: henkilotiedot){
            System.out.println(heti.getEtunimi()+" "+heti.getSukunimi());
        }

    }
}
