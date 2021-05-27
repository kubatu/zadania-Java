import javax.persistence.*;

@Entity
public class Przedmiot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nazwaprzedmiotu;
    @ManyToOne(cascade = CascadeType.ALL)
    Nauczyciel nauczyciel;
    @ManyToOne(cascade = CascadeType.ALL)
    Klasa klasaaa;

    public Przedmiot(){
    }

    public Przedmiot(String nazwaprzedmiotu){
        this.nazwaprzedmiotu = nazwaprzedmiotu;
    }

    public Nauczyciel getNauczyciel(){
        return nauczyciel;
    }

    public void setNauczyciel(Nauczyciel nauczyciel){
        this.nauczyciel = nauczyciel;
    }

    public Klasa getKlasaaa(){
        return klasaaa;
    }

    public void setKlasa(Klasa klasaaa){
        this.klasaaa = klasaaa;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNazwaprzedmiotu(){return nazwaprzedmiotu;}
    public void setNazwaprzedmiotu(String nazwaprzedmiotu){this.nazwaprzedmiotu = nazwaprzedmiotu;}

}
