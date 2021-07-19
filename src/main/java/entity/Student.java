package entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Student_Id;
	private String firstName;
	private String lastName;
	private int year;

}
