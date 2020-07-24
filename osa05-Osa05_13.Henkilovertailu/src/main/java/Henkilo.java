
import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }
    public String getNimi(){
        return this.nimi;
    }
    public int getPituus(){
        return this.pituus;
    }
    public int getPaino(){
        return this.paino;
    }
    public Paivays getSynttarit(){
        return this.syntymaPaiva;
    }
    
    
    public boolean equals(Object verrattava){
        if (this == verrattava) {
            return true;
        }
        if (!(verrattava instanceof Henkilo)) {
            return false;
        }
        Henkilo verrattavaHenkilo = (Henkilo) verrattava;
        if ( this.nimi.equals(verrattavaHenkilo.getNimi())){
            if (this.pituus == verrattavaHenkilo.getPituus()){
                if (this.paino == verrattavaHenkilo.getPaino()){
                    if (this.syntymaPaiva.getPaiva() == verrattavaHenkilo.syntymaPaiva.getPaiva()){
                        if (this.syntymaPaiva.getKuukausi() == verrattavaHenkilo.syntymaPaiva.getKuukausi()){
                            if (this.syntymaPaiva.getVuosi() == verrattavaHenkilo.syntymaPaiva.getVuosi()){
                                return true;
                            }
                        }
                    }
                        
                }
                
            }
        }else{
            return false;
        }
        return false;
    }
    // toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
}
