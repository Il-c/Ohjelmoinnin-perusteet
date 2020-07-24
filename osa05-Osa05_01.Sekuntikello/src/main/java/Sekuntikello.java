/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vstore
 */
public class Sekuntikello {
    private Viisari sadasosat;
    private Viisari sekunnit;
    
    public Sekuntikello (){
        this.sadasosat= new Viisari(100);
        this.sekunnit=new Viisari(60);
        
    }
    @Override
    public String toString(){
        return this.sekunnit + ":" + this.sadasosat;
    }
    public void etene(){
        this.sadasosat.etene();
        if (this.sadasosat.arvo() == 0){
            this.sekunnit.etene();
        }
        
    }
}
