package spring.training.artifacts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Vendor {
    @Id
    /*
    @SequenceGenerator(name="vendor_seq_id", sequenceName = "vendor_sequence", initialValue = 1000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendor_seq_id")
    */
    
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
     * @TableGenerator(name = "pat_id_generator", table = "pat_id_values",  
                                  pkColumnName= "pat_id",  pkColumnValue = "pat_id_nxt_value",   
   initialValue = 1000, allocationSize = 1) 
     */
     @GeneratedValue(strategy = GenerationType.TABLE)
	int vendorId;
	String vendorName;
	String address;
	long contactNo;
	double salary;
	
	
}
