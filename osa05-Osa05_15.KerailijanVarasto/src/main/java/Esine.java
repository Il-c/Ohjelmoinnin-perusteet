/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vstore
 */
public class Esine {
    private String nimi;
    private String tunnus;

    public Esine(String nimi, String tunnus) {
        this.nimi = nimi;
        this.tunnus = tunnus;
    }

    public String getNimi() {
        return this.nimi;
    }

    public String getTunnus() {
        return this.tunnus;
    }
    
    public boolean equals(Object verrattava) {
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne samat
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Lintu-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Esine)) {
            return false;
        }

        // muunnetaan olio Lintu-olioksi
        Esine verrattavaEsine = (Esine) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
        return (this.tunnus.equals(verrattavaEsine.tunnus));

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
    @Override
    public String toString() {
        return this.tunnus + ": " + this.nimi;
    }
}
