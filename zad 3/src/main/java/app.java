import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class app {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("moja-baza");
        EntityManager em = emf.createEntityManager();

        // Klasy
        Klasa k1 = new Klasa("1 A",1);
        Klasa k2 = new Klasa("2 A",2);
        Klasa k3 = new Klasa("3 A",3);

        // Uczniowie
        Uczen u1 = new Uczen("Jacek","Nowak");
        Uczen u2 = new Uczen("Zenon","Kowalczyk");
        Uczen u3 = new Uczen("Piotr","Prawy");
        Uczen u4 = new Uczen("Jacek","Lewy");
        Uczen u5 = new Uczen("Krzysztof","Kwiatkowski");
        Uczen u6 = new Uczen("Mateusz","Mazur");
        Uczen u7 = new Uczen("Jakub","Krawczyk");
        Uczen u8 = new Uczen("Anna","Michalska");
        Uczen u9 = new Uczen("Sylwia","Grabowska");
        Uczen u10 = new Uczen("Anita","Piotrowska");
        Uczen u11 = new Uczen("Bogdan","Nowakowski");
        Uczen u12 = new Uczen("Sylwia","Olszewska");
        Uczen u13 = new Uczen("Andrzej","Sikora");
        Uczen u14 = new Uczen("Piotr","Sikora");
        Uczen u15 = new Uczen("Karol","Szewczyk");

        // Nauczyciele
        Nauczyciel n1 = new Nauczyciel("Tadeusz","Kwiat");
        Nauczyciel n2 = new Nauczyciel("Mateusz","Kowal");
        Nauczyciel n3 = new Nauczyciel("Sebastian","Lewandoski");

        n1.setPrzedmioty(new ArrayList<>());
        n2.setPrzedmioty(new ArrayList<>());
        n3.setPrzedmioty(new ArrayList<>());

        // Przedmioty
        Przedmiot p1= new Przedmiot("Geografia");
        p1.setNauczyciel(n1);
        n1.getPrzedmioty().add(p1);

        Przedmiot p2= new Przedmiot("Fizyka");
        p2.setNauczyciel(n2);
        n2.getPrzedmioty().add(p2);

        Przedmiot p3= new Przedmiot("Matematyka");
        p3.setNauczyciel(n3);
        n3.getPrzedmioty().add(p3);

        Przedmiot p4= new Przedmiot("Biologia");
        p4.setNauczyciel(n2);
        n2.getPrzedmioty().add(p4);

        Przedmiot p5 = new Przedmiot("Chemia");
        p5.setNauczyciel(n2);
        n2.getPrzedmioty().add(p5);

        Przedmiot p6 = new Przedmiot("Historia");
        p6.setNauczyciel(n3);
        n3.getPrzedmioty().add(p6);

        Przedmiot p7 = new Przedmiot("Muzyka");
        p7.setNauczyciel(n1);
        n1.getPrzedmioty().add(p7);

        Przedmiot p8 = new Przedmiot("Plastyka");
        p8.setNauczyciel(n1);
        n1.getPrzedmioty().add(p8);

        Przedmiot p9 = new Przedmiot("Technika");
        p9.setNauczyciel(n2);
        n2.getPrzedmioty().add(p9);

        Przedmiot p10 = new Przedmiot("Polski");
        p10.setNauczyciel(n3);
        n3.getPrzedmioty().add(p10);

        Przedmiot p11 = new Przedmiot("Angielski");
        p11.setNauczyciel(n3);
        n3.getPrzedmioty().add(p11);

        Przedmiot p12 = new Przedmiot("Niemiecki");
        p12.setNauczyciel(n1);
        n1.getPrzedmioty().add(p12);

        k1.setNauczyciel(n1);
        n1.setKlasaaa(k1);
        k1.setUczniowie(new ArrayList<>());
        u1.setKlasa(k1);
        u2.setKlasa(k1);
        u3.setKlasa(k1);
        u4.setKlasa(k1);
        u5.setKlasa(k1);
        k1.setPrzedmioty(new ArrayList<>());
        p1.setKlasa(k1);
        p2.setKlasa(k1);
        p3.setKlasa(k1);
        p4.setKlasa(k1);
        k1.getUczniowie().add(u1);
        k1.getUczniowie().add(u2);
        k1.getUczniowie().add(u3);
        k1.getUczniowie().add(u4);
        k1.getUczniowie().add(u5);
        k1.getPrzedmioty().add(p1);
        k1.getPrzedmioty().add(p2);
        k1.getPrzedmioty().add(p3);
        k1.getPrzedmioty().add(p4);

        k2.setNauczyciel(n2);
        n2.setKlasaaa(k2);
        k2.setUczniowie(new ArrayList<>());
        u6.setKlasa(k2);
        u7.setKlasa(k2);
        u8.setKlasa(k2);
        u9.setKlasa(k2);
        u10.setKlasa(k2);
        k2.setPrzedmioty(new ArrayList<>());
        p5.setKlasa(k2);
        p6.setKlasa(k2);
        p7.setKlasa(k2);
        p8.setKlasa(k2);
        k2.getUczniowie().add(u6);
        k2.getUczniowie().add(u7);
        k2.getUczniowie().add(u8);
        k2.getUczniowie().add(u9);
        k2.getUczniowie().add(u10);
        k2.getPrzedmioty().add(p5);
        k2.getPrzedmioty().add(p6);
        k2.getPrzedmioty().add(p7);
        k2.getPrzedmioty().add(p8);

        k3.setNauczyciel(n3);
        n3.setKlasaaa(k3);
        k3.setUczniowie(new ArrayList<>());
        u11.setKlasa(k3);
        u12.setKlasa(k3);
        u13.setKlasa(k3);
        u14.setKlasa(k3);
        u15.setKlasa(k3);
        k3.setPrzedmioty(new ArrayList<>());
        p9.setKlasa(k3);
        p10.setKlasa(k3);
        p11.setKlasa(k3);
        p12.setKlasa(k3);
        k3.getUczniowie().add(u11);
        k3.getUczniowie().add(u12);
        k3.getUczniowie().add(u13);
        k3.getUczniowie().add(u14);
        k3.getUczniowie().add(u15);
        k3.getPrzedmioty().add(p9);
        k3.getPrzedmioty().add(p10);
        k3.getPrzedmioty().add(p11);
        k3.getPrzedmioty().add(p12);


        em.getTransaction().begin();
        em.persist(k1);
        em.persist(k2);
        em.persist(k3);
        em.getTransaction().commit();


        // Zad 1
        System.out.println("Zad 1");
        Uczen uuu = em.createQuery("SELECT u FROM Uczen u", Uczen.class).getResultList().get(0);
        System.out.println("Uczen: " + uuu.getFirstName() + "   " +  uuu.getFamilyName());
        for(Przedmiot p : uuu.getKlasa().getPrzedmioty()){
            System.out.println(p.getNazwaprzedmiotu());
        }

        // Zad 2
        System.out.println("Zad 2");
        Nauczyciel nnn = em.createQuery("SELECT n FROM Nauczyciel n", Nauczyciel.class).getResultList().get(0);
        for(Przedmiot przed : nnn.getPrzedmioty()){
            System.out.println("Przedmiot: " + przed.getNazwaprzedmiotu());
            for(Uczen ucz : przed.getKlasaaa().getUczniowie()){
                System.out.println(ucz.getFirstName() + "   " + ucz.getFamilyName());
            }
        }
    }
}
