package spring.training.artifacts.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.training.artifacts.entity.AmazonOrders;

public interface AmazonOrdersRepository extends JpaRepository<AmazonOrders, Integer> {

	

}
