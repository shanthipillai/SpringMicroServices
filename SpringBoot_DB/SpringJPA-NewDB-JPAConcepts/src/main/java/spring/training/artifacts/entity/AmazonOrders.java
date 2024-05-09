package spring.training.artifacts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class AmazonOrders {

	@Id
private int orderId;
private int noOfItems;
private double amount;
private String email;
private int pincode;
private String city;
private String gender;

@Override
public String toString() {

	return orderId+" "+noOfItems+" "+amount+" "+email+" "+city+" "+gender;
}

}
