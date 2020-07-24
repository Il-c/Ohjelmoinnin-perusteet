/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vstore
 */
public class Musiikkikappale {
    private int pituus;
    private String nimi;
    
    public Musiikkikappale(String kappaleenNimi, int kappaleenPituus){
        this.pituus = kappaleenPituus;
        this.nimi = kappaleenNimi;
    }
    public String nimi(){
        return this.nimi;
    }
    public int pituus(){
        return this.pituus;
    }
}
