package spring.training.artifacts.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.training.artifacts.entity.Patient;

public interface ProjectInf extends JpaRepository<Patient, Integer>{

	List<Patient> findByPatientName(String s);

}
