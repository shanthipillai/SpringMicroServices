package spring.training.artifacts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import spring.training.artifacts.db.impl.AmazonOrderImplementation;
import spring.training.artifacts.db.impl.ProjectRepoImpl;
import spring.training.artifacts.db.impl.VendorImpl;
import spring.training.artifacts.entity.AmazonOrders;
import spring.training.artifacts.entity.Patient;
import spring.training.artifacts.entity.Vendor;

@SpringBootApplication
public class SpringJpaNewDbJpaConceptsApplication {

	public static void main(String[] args) throws NumberFormatException, IOException  {
	ApplicationContext context=	SpringApplication.run(SpringJpaNewDbJpaConceptsApplication.class, args);

	//ProjectRepoImpl obj= context.getBean(ProjectRepoImpl.class);
	//VendorImpl vobj= context.getBean(VendorImpl.class);
	AmazonOrderImplementation order=context.getBean(AmazonOrderImplementation.class);
	//Patient patient=new Patient();
/*    patient.setPatientId(11);
     patient.setPatientName("shanthi");
	
    patient.setPatientAge(12);
    
    
    Patient patient1=new Patient();
    patient1.setPatientId(12);
     patient1.setPatientName("shandhi");
     
	
    patient1.setPatientAge(22);
	obj.addPatients(patient);
	obj.addPatients(patient1);

	
	
	Patient p1=new Patient();
	p1.setPatientId(45);
	p1.setPatientName("patient");
	p1.setPatientAge(33);
	
	Patient p2=new Patient();
	p2.setPatientId(55);
	p2.setPatientName("patients");
	p2.setPatientAge(34);
     
	obj.saveAllPatients(List.of(p1,p2));
	*/
  // obj.retrieveAllPatients();
/*
	Patient p1=new Patient();
	p1.setPatientId(85);
	p1.setPatientName("pat");
	p1.setPatientAge(33);
	obj.addPatients(p1);
*/	
  //obj.retrieveByPatientName("shanu");
	/*
	Vendor v=new Vendor();
	v.setVendorName("think");
	v.setSalary(30000);
	v.setContactNo(986646645);
	v.setAddress("whywhy");
	
	vobj.saveVendor(v);
	*/
    
	
	/*
	
	File amazonfile=new File("D:\\amazonorders.txt");
	FileReader fr=new FileReader(amazonfile);
	BufferedReader br=new BufferedReader(fr);
	String fileLine;
	List<AmazonOrders> amazonOrders=new ArrayList<>();
	while((fileLine=br.readLine())!=null)
	{
		String filebytes[]=fileLine.split(",");
		int orderid=Integer.parseInt(filebytes[0]);
		int noOfIterms=Integer.parseInt(filebytes[1]);
		String email=filebytes[2];
		int pincode=Integer.parseInt(filebytes[3]);
		int amount=Integer.parseInt(filebytes[4]);
		String city=filebytes[5];
		String gender=filebytes[6];
		AmazonOrders orders=new AmazonOrders();
		orders.setOrderId(orderid);
		orders.setNoOfItems(noOfIterms);
		orders.setEmail(email);
		orders.setPincode(pincode);
		orders.setAmount(amount);
		orders.setCity("city");
		orders.setGender(gender);
		amazonOrders.add(orders);
		
	}
	br.close();
	
	order.saveAllOrder(amazonOrders);
	*/
	
	//order.fetchAllOrders();
	
	

	order.getRecordsByPageIdAndNoOfRecords(1,2);
	
}
	
}
