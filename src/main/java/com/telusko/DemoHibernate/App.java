package com.telusko.DemoHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        HartfordProject hartfordProject1= new HartfordProject();
        /*hartfordProject1.setNumberOfResources(40);
        hartfordProject1.setProjectBudget(40000000);
        hartfordProject1.setProjectID("H102");
        hartfordProject1.setProjectManager("ABD");
        hartfordProject1.setProjectName("RADICLE");*/

        Configuration conn = new Configuration().configure().addAnnotatedClass(HartfordProject.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = conn.buildSessionFactory(reg);
        Session session =  sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        //session.save(hartfordProject1);
        hartfordProject1 = (HartfordProject) session.get(HartfordProject.class, "H102");
        tx.commit();
        System.out.println(hartfordProject1);
    }
}
