package spring.training.artifacts.db;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.training.artifacts.entity.Vendor;

public interface VendorInterf extends JpaRepository<Vendor, Integer> {

}
