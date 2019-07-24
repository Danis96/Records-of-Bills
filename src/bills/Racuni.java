package bills;
// Generated May 19, 2019 10:25:45 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="racuni"
    ,catalog="Bills"
)
public class Racuni  implements java.io.Serializable {


     private int racuniId;
     private String racIme;
     private float racIznos;
     private String racDatum;
     private String racPlatio;

    public Racuni() {
    }

    public Racuni(String racIme, float racIznos, String racDatum, String racPlatio) {
       this.racIme = racIme;
       this.racIznos = racIznos;
       this.racDatum = racDatum;
       this.racPlatio = racPlatio;
    }
   
     @Id 

    
    @Column(name="racuni_id", unique=true, nullable=false)
    public int getRacuniId() {
        return this.racuniId;
    }
    
    public void setRacuniId(int racuniId) {
        this.racuniId = racuniId;
    }

    
    @Column(name="rac_ime", nullable=false, length=200)
    public String getRacIme() {
        return this.racIme;
    }
    
    public void setRacIme(String racIme) {
        this.racIme = racIme;
    }

    
    @Column(name="rac_iznos", nullable=false, precision=4)
    public float getRacIznos() {
        return this.racIznos;
    }
    
    public void setRacIznos(float racIznos) {
        this.racIznos = racIznos;
    }


    
    @Column(name="rac_datum", nullable=false, length=10)
    public String getRacDatum() {
        return this.racDatum;
    }
    
    public void setRacDatum(String racDatum) {
        this.racDatum = racDatum;
    }

    
    @Column(name="rac_platio", nullable=false, length=20)
    public String getRacPlatio() {
        return this.racPlatio;
    }
    
    public void setRacPlatio(String racPlatio) {
        this.racPlatio = racPlatio;
    }




}


