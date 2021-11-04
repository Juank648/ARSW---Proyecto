package edu.eci.arsw.project.persistence;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conexion {
    private static SessionFactory factory;

    public static SessionFactory getEntityManagerFactory() {
        if (factory == null) {
            System.out.println("Entra a getEntityManagerFactoryEV()");
            Configuration conf = new Configuration();
            conf.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            conf.setProperty("hibernate.hbm2ddl.auto", "update");
            conf.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            conf.setProperty("hibernate.connection.url",
                    "jdbc:postgresql://"+System.getenv("DB_HOST")+":"+System.getenv("DB_PORT")+"/"+System.getenv("DB_NAME"));
            conf.setProperty("hibernate.connection.username", System.getenv("DB_USER"));
            conf.setProperty("hibernate.connection.password", System.getenv("DB_PS"));
            //conf.addAnnotatedClass(.class);
            factory = conf.buildSessionFactory();
        }
        return factory;
    }

    public static void shutdown() {
        System.out.println("Entra a shutDownEV()");
        if (factory != null) {
            factory.close();
        }
    }
}
