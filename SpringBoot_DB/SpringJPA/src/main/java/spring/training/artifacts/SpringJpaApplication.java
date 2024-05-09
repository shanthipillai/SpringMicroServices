package spring.training.artifacts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) throws IOException {
	ApplicationContext context	=SpringApplication.run(SpringJpaApplication.class, args);
	PatientOperations po=context.getBean(PatientOperations.class);
	Patient p=new Patient();

	p.setAge(28);
	p.setContact("9010");
	p.setEmailId("shanthigmail");
	p.setGender("female");
	p.setName("shanthi");
	
	po.addPatient(p);
	//po.deletePatient("shanthigmail");
	
	//po.fetchPatientDetails("shanthigmail");
	//po.getAllPatientsList();
	
   //  po.findByName("shanthi");
	
	//po.findByNameAndGender("shanthi", "female");
	/*
	
	po.findByNameAndEmail("shanthi", "shanthigmail");
	
	BufferedReader br=new BufferedReader(new FileReader("D:\\patient.txt"));
	String line=null;
	ArrayList<Patient> al=new ArrayList<>();
	while((line=br.readLine())!=null)
	{
		String patientdetails[]=line.trim().split(",");
		Integer val1=Integer.valueOf(patientdetails[0]);
		String val2=patientdetails[1];
		String val3=patientdetails[2];
		String val4=patientdetails[3];
		String val5=patientdetails[4];
				
		Patient patient=new Patient(val3,val2,val1,val4,val5);
		al.add(patient);
		
		
	}
	

Iterator<Patient> itr=	al.iterator();
while(itr.hasNext())
{
	Patient pa=itr.next();
	System.out.println(pa);
}
	
po.saveAllPatients(al);
System.out.println("==============");
po.getByAge(16);

System.out.println("==============");
po.getFirst3ByAge(16);

po.updateByUserContact("sh@gmail.com", "90108");
	
	*/
	}

}
