package web;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(NOT_FOUND)
public class StudentNotFoundException extends RuntimeException{
	
	public StudentNotFoundException() {
        super();
    }
}
