
public class Kirja {

    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }
    
    public boolean equals(Object verrattava) {
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne samat
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Lintu-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Kirja)) {
            return false;
        }

        // muunnetaan olio Lintu-olioksi
        Kirja verrattavaKirja = (Kirja) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
        return this.nimi.equals(verrattavaKirja.nimi)&&(this.julkaisuvuosi==verrattavaKirja.julkaisuvuosi);

        /*
        // yllä oleva nimen vertailu vastaa alla olevaa
        // koodia

        if (this.nimi.equals(verrattavaLintu.nimi)) {
            return true;
        }

        // muulloin oliot eivät ole samat
        return false;
        */
    }
}
