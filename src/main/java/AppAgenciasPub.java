import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppAgenciasPub {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgenciasPublicitariasPU"); // Comprobar nombre de la PU
        EntityManager em = emf.createEntityManager();
    }

}