package web;

import entity.Student;
import lombok.Data;

@Data
public class StudentDto {
	
	private Long id;
    private String firstName;
    private String lastName;
    private int year;
	
}
