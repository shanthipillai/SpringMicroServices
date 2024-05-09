package spring.training.artifacts.db.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import spring.training.artifacts.db.ProjectInf;

import spring.training.artifacts.entity.Patient;

@Component
public class ProjectRepoImpl {
	
	@Autowired
	ProjectInf projectrepo;

	public void addPatients(Patient patient)
	{

		projectrepo.save(patient);
		
	}
	
	
	public void saveAllPatients(List<Patient> patient)
	{
		projectrepo.saveAll(patient);
		
		
		
	}
	
	
	public void retrieveByPatientName(String s)
	{
		//List<Patient> p=projectrepo.findByPatientName(s);
		List<Patient> p=projectrepo.findAll();
		p.stream().filter(p1->p1.getPatientName().equals("shanu")).forEach(System.out::println);
	}
	
	public void retrieveAllPatients()
	{
		//List<Patient> patients=projectrepo.findAll(Sort.by("patientAge").descending());
		//List<Patient> patients=projectrepo.findAll(Sort.by(Direction.DESC,"patientAge"));
		//List<Patient> patients=	projectrepo.findAll(Sort.unsorted());
		projectrepo.findAll(Sort.unsorted()).stream().filter(p->(p.getPatientAge()>30 && p.getPatientAge()<40)).forEach(System.out::println);
		String s[]={"hello","print","hello"};
		Arrays.asList(s).stream().distinct().forEach(System.out::println);
		
		
		
		
	/*	
		Iterator<Patient> patientir=patients.iterator();
	
		while(patientir.hasNext())
		{
			Patient p=patientir.next();
			System.out.println(p.getPatientId()+"  "+p.getPatientName()+" "+p.getPatientAge());
		}
		*/
	}
}
