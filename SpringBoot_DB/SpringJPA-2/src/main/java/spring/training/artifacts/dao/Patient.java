package spring.training.artifacts.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_details")
public class Patient {
	@Id
	@Column(name="patient_id")
	@SequenceGenerator(name = "pat_id_seq", sequenceName = "patient_id_seq",   
    initialValue = 1000, allocationSize = 1) 
@GeneratedValue(strategy = GenerationType.SEQUENCE,  
                         generator = "pat_id_seq") 
private long patientId;
	@Column(name="patient_name")
private String name;
	@Column(name="patient_age")
private int age;


public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient(long patientId, String name, int age) {
	super();
	this.patientId = patientId;
	this.name = name;
	this.age = age;
}
public long getPatientId() {
	return patientId;
}
public void setPatientId(long patientId) {
	this.patientId = patientId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Patient ID= "+patientId+
			"Patient Name="+name+
			"Patient_age="+age;
}

}
