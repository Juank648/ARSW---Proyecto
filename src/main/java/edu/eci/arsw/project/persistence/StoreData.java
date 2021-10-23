package edu.eci.arsw.project.persistence;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void makeBD(){
        System.out.println("---------------------- PARTE 1 ----------------------");
        //StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        System.out.println("--------------------- PARTE 1.1 ----------------------");
        //Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        Configuration cfg = new Configuration();
        cfg.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
        cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        cfg.setProperty("hibernate.connection.url",
                "jdbc:postgresql://"+System.getenv("DB_HOST")+":"+System.getenv("DB_PORT")+"/"+System.getenv("DB_NAME"));
        cfg.setProperty("hibernate.connection.username", System.getenv("DB_USER"));
        cfg.setProperty("hibernate.connection.password", System.getenv("DB_PS"));


        System.out.println("-----------------------------------------------------");

        System.out.println("---------------------- PARTE 2 ----------------------");
        //SessionFactory factory = meta.getSessionFactoryBuilder().build();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        System.out.println("-----------------------------------------------------");
    }

}
