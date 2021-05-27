import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class app {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("moja-baza");
        EntityManager em = emf.createEntityManager();

        Person p = new Person();
        p.setFirstName("Andrzej");
        p.setFamilyName("Nowak");
        p.setAge(27);

        em.getTransaction().begin();
        em.persist(p);

        // 6
        Query q = em.createQuery("UPDATE Person p set p.age=18 WHERE p.age<18");
        q.executeUpdate();

        em.getTransaction().commit();

        // 7
        Query q2 = em.createQuery("Select p from Person p WHERE p.firstName IS NOT NULL AND p.familyName IS NOT NULL");
        List<Person> people = q2.getResultList();
        System.out.println(people.size());

        // 8
        Query q3 = em.createQuery("Select p from Person p WHERE p.firstName LIKE 'a%'");
        List<Person> people2 = q3.getResultList();
        for(Person prsn : people2){
            System.out.println(prsn.getFirstName() + " " + prsn.getFamilyName());
        }
    }
}
