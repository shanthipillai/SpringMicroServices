package spring.training.artifacts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;
@Transactional
public interface PatientRepository extends JpaRepository<Patient, String> {

	Patient findByName(String name);

	List<Patient> findByNameAndGender(String name, String gender);

	Patient findByNameAndEmailId(String name, String email);

	List<Patient> findByAge(int age);

}
