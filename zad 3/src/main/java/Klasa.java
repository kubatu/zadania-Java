import javax.persistence.*;
import java.util.List;

@Entity
public class Klasa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nazwaklasy;
    private int rok;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "klasa")
    List<Uczen> uczniowie;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "klasaaa")
    Nauczyciel nauczyciel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "klasaaa")
    List<Przedmiot> przedmioty;

    public Klasa(){
    }

    public Klasa(String nazwaklasy, int rok){
        this.nazwaklasy = nazwaklasy;
        this.rok = rok;
    }

    public List<Uczen> getUczniowie(){
        return uczniowie;
    }

    public void setUczniowie(List<Uczen> uczniowie){
        this.uczniowie = uczniowie;
    }

    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty) {
        this.przedmioty = przedmioty;
    }

    public Nauczyciel getNauczyciel(){
        return nauczyciel;
    }

    public void setNauczyciel(Nauczyciel nauczyciel) {
        this.nauczyciel = nauczyciel;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNazwaklasy() {return nazwaklasy;}
    public void setNazwaklasy(String nazwaklasy) {this.nazwaklasy = nazwaklasy;}
    public int getRok(){return rok;}
    public void setRok(int rok) {this.rok = rok;}
}
