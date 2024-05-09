package spring.training.artifacts.repo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import spring.training.artifacts.dao.Patient;

@Component
public class PatirntOperations {
    @Autowired
	PatientRepo patientRepo;
    
    

	public PatirntOperations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatirntOperations(PatientRepo patientRepo) {
		super();
		this.patientRepo = patientRepo;
	}

	public PatientRepo getPatientRepo() {
		return patientRepo;
	}

	public void setPatientRepo(PatientRepo patientRepo) {
		this.patientRepo = patientRepo;
	}
    
	
	
	public void addPatient()
	{
		Patient pa=new Patient();
		pa.setName("name");
		pa.setAge(23);
		patientRepo.save(pa);
		
		
	}
	
	
	public void addAllPatients(List<Patient> patientsList) throws IOException
	{
		patientsList.forEach(p->System.out.println(p.getName()+""+p.getAge()));
		patientRepo.saveAll(patientsList);
		
		
	}
	/*
	public void getAllPatients()
	{
		List<Patient> patients=patientRepo.findAll();
	
		patients.forEach(patient->System.out.println(patient.getPatientId()+""+patient.getName()+patient.getAge()));
	    
	}
	
public void findByNameList(String name)
{
	List<Patient> byName=patientRepo.findByName(name);
	
	byName.forEach(System.out::println);
	

}


public void sortbyID()
{
	List<Patient> patients=patientRepo.findAll(Sort.by("patientId"));
	patients.forEach(System.out::println);
}

public void sortbyIDDec()
{
	List<Patient> patients=patientRepo.findAll(Sort.by(Direction.DESC, "patientId"));
	patients.forEach(System.out::println);
}

*/
//Paging Concepts

//Paging Concepts

public void getPage()
{
	Page<Patient> patients= patientRepo.findAll(Pageable.ofSize(7));
	List<Patient> p=patients.getContent();
	p.forEach(System.out::println);
	
	
}




}
