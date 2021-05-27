import javax.persistence.*;

@Entity
public class Uczen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String familyName;
    @ManyToOne(cascade = CascadeType.ALL)
    Klasa klasa;

    public Uczen() {
    }

    public Uczen(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public Klasa getKlasa(){
        return klasa;
    }

    public void setKlasa(Klasa klasa){
        this.klasa = klasa;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getFamilyName() {return familyName;}
    public void setFamilyName(String familyName) {this.familyName = familyName;}

}
