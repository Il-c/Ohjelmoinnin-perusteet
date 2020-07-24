/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vstore
 */
public class Laskuri {
    private int luku;
    
    public Laskuri(int alkuarvo){
        this.luku = alkuarvo;
    }
    public Laskuri(){
        this(0);
    }
    
    public int arvo(){
        return this.luku;
    }
    public void lisaa(){
        this.luku++;
    }
    public void vahenna(){
        this.luku--;
    }
    public void lisaa(int lisays){
        if (lisays>=0){
            this.luku += lisays;
        }
    }
    public void vahenna(int vahennys){
        if (vahennys>=0){
            this.luku -= vahennys;
        }
    }
    
}



