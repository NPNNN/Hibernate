package in.ineron.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineorn.ai.Student;

public class TestAPP {
	public static void main(String []args) throws IOException {
	
	// 1.Inform JVM to active Hibernate
   Configuration configuration = new Configuration();
   configuration.configure();
   
   
   //Creating a sesson factory object to perform our persistance operation 
   SessionFactory sessionFactory = configuration.buildSessionFactory();
   Session openSession = sessionFactory.openSession(); //connection object , ORM Dilect, L1-CACHE,TxtManagement
   
   
   Transaction beginTransaction = openSession.beginTransaction();
  
   
	//2.Create persistacne object
   Student student = new Student();
   student.setSid(101);
   student.setSname("Narendar");
   student.setEage(24);
   student.setEaddress("Parel");
	
	//3.Perform persistance operation using Entity/ Model/ Pojo Object
   openSession.save(student);
   System.in.read();
   
   //Generate the query and sent it to  database
   beginTransaction.commit();
   System.out.println("Object save sucessfully");

}
}
