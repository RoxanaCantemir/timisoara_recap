import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setName("Perfume");
        // git branch test
        stock.setValue(5);
        Session session = HibernateConfig.getSession();
        session.beginTransaction();
        session.save(stock);
        session.getTransaction().commit();
        session.close();
    }
}
