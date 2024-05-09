package spring.training.artifacts.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import spring.training.artifacts.dao.Patient;

public interface PatientRepo extends CrudRepository<Patient, Long> {

	List<Patient> findByName(String name);
	Page<Patient>	findAll(Pageable pageable);

}
