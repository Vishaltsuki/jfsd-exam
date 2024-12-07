package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Vehicle.class)
                                .addAnnotatedClass(Car.class)
                                .addAnnotatedClass(Truck.class)
                                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Car car1 = new Car("Audi", "Car", 200, "Red", 4);
            Truck truck1 = new Truck("Volvo", "Truck", 150, "Blue", 1000);

            session.save(car1);
            session.save(truck1);

            session.getTransaction().commit();
            System.out.println("Inserted Car and Truck successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
            factory.close();
        }
    }
}
