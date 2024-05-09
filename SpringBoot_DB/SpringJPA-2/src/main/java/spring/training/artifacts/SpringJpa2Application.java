package spring.training.artifacts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import spring.training.artifacts.dao.Patient;
import spring.training.artifacts.repo.PatirntOperations;

@SpringBootApplication
public class SpringJpa2Application {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ApplicationContext context=SpringApplication.run(SpringJpa2Application.class, args);
		PatirntOperations po= context.getBean(PatirntOperations.class);
	
	     //po.addPatient();
	     
	     /*
	     List<Patient> plist=new ArrayList<>();
	     FileReader fr=new FileReader("D:\\Spring\\PatientInfo.txt");
	     BufferedReader br=new BufferedReader(fr);
	     String details;
	     while((details=br.readLine())!=null)
	     {
	    	 String patientDetails[]=details.split(",");
	    	 
	    	 
	    	 String name=patientDetails[0];
	    	 Integer age=Integer.valueOf(patientDetails[1]);
	    	 System.out.println(name+""+age);
	    	 Patient p=new Patient();
	    	 p.setName(name);
	    	 p.setAge(age);
	    	plist.add(p);
	     }
	     br.close();
	     */
	   //  System.out.println("plist"+plist);
//po.addAllPatients(plist);
	    // po.getAllPatients();
	   // po.findByNameList("MNB");
	    // po.sortbyIDDec();
	    // po.getPage();
	
		Class cls=Class.forName("org.springframework.stereotype.Component");
		AnnotatedType[] at=cls.getAnnotatedInterfaces();
		for(AnnotatedType a:at)
		{
			System.out.println(a.getDeclaredAnnotations());
			Annotation[] an=a.getDeclaredAnnotations();
			for(Annotation ann:an)
			{
				System.out.println(ann.toString());
			}
		}
		
	}

}
