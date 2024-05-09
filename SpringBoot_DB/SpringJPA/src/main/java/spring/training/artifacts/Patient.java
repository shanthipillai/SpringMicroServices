package spring.training.artifacts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Patient {
@Id
@Column
private String emailId;

@Column
private String name;
@Column
private int age;
@Column
private String gender;
@Column 
private String contact;

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name="+name+
				"\nEmail="+emailId+
				"\nAge="+age+
				"\nGender="+gender;
	}


}
