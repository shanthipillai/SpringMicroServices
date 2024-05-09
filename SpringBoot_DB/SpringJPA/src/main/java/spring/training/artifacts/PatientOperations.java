package spring.training.artifacts;

import java.util.List;

import java.util.Optional;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.slf4j.*;

@Component
public class PatientOperations {
	@Autowired
    
	PatientRepository patientrepo;
	
    
	
	
	public void saveAllPatients(List<Patient> p)
	{
		patientrepo.saveAll(p);
	}
	
	public void addPatient(Patient p)
	{
		patientrepo.save(p);
		
	}

	
	public void deletePatient(String email)
	{
		patientrepo.deleteById(email);
	}
	
	

	public void fetchPatientDetails(String email)
	{
		Optional<Patient> op=patientrepo.findById(email);
	
		System.out.println(op.get().getName()+""+op.get().getContact());
		/*
		
	    System.out.println("========================================================");
	    
	    Patient p=patientrepo.getOne(email);
	    System.out.println(p);
	    
	    
	    System.out.println("=======================================================");
	    Patient p1=patientrepo.getById(email);
	    System.out.println(p);
	    */
		
	}
	
	public void findByName(String name)
	{
		Patient p=patientrepo.findByName(name);
		System.out.println(p);
		
		
		
	}
	
	public void findByNameAndGender(String name, String gender)
	{
		List<Patient> plist=patientrepo.findByNameAndGender(name, gender);
		for(Patient p:plist)
		{
			System.out.println(p);
		}
	}
	
	
	public void findByNameAndEmail(String name, String email)
	{
		Patient p=patientrepo.findByNameAndEmailId(name, email);
		System.out.println(p);
	}
	
	public void getAllPatientsList()
	{
		List<Patient> plist=patientrepo.findAll();
		
		for(Patient p:plist)
		{
			System.out.println(p);
		}
	}
	
	
	public void getByAge(int age)
	{
		int count=0;
		
		List<Patient> patientlistbyage=patientrepo.findByAge(age);
		
		for(Patient p:patientlistbyage)
		{
			System.out.println(p);
			count++;
		}
		
		System.out.println("Total records"+count);
	}
	
	public void getFirst3ByAge(int age)
	{
		int count=0;
		System.out.println("Patient details by age");
		List<Patient> patientlistbyage=patientrepo.findByAge(age);
		
		for(Patient p:patientlistbyage)
		{
			System.out.println(p);
			count++;
		}
		
		System.out.println("Total records"+count);
	}
	
	public void updateByUserContact(String email, String contact)
	{
	Patient patient=patientrepo.findById(email).get();
	patient.setContact(contact);
    patientrepo.save(patient);
	}
	
	
}
