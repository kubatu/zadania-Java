import javax.persistence.*;
import java.util.List;

@Entity
public class Nauczyciel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String familyName;
    @OneToOne(cascade = CascadeType.ALL)
    Klasa klasaaa;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "nauczyciel")
    List<Przedmiot> przedmioty;

    public Nauczyciel(){
    }

    public Nauczyciel(String firstName,String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public Klasa getKlasaaa(){
        return klasaaa;
    }

    public void setKlasaaa(Klasa klasaaa){
        this.klasaaa = klasaaa;
    }

    public List<Przedmiot> getPrzedmioty(){
        return przedmioty;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty){
        this.przedmioty = przedmioty;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getFamilyName() {return familyName;}
    public void setFamilyName(String familyName) {this.familyName = familyName;}

}
