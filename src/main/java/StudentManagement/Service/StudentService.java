package StudentManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import StudentManagement.Entity.StudentEntity;
import StudentManagement.Repository.StudentRepository;
import StudentManagement.Response.Response;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Response saveStudent(StudentEntity studentEntity) {
    	try {
    		Response response = new Response(HttpStatus.OK,"CREATED",studentRepository.save(studentEntity));
    		return response;
    	}
    	catch(Exception e) {
    		Response response = new Response(HttpStatus.BAD_REQUEST,"error",studentRepository.save(studentEntity));
    		return response;
    	}
    }
	
	public Response getStudent() {
    	try {
    		Response response = new Response(HttpStatus.OK,"SUCCESS",studentRepository.findAll());
    		return response;
    	}
    	catch(Exception e) {
    		Response response = new Response(HttpStatus.BAD_REQUEST,"error",studentRepository.findAll());
    		return response;
    	}
    }
	
	public Response getStudentById(int studentId) {
    	try {
    		Response response = new Response(HttpStatus.OK,"SUCCESS",studentRepository.findById(studentId));
    		return response;
    	}
    	catch(Exception e) {
    		Response response = new Response(HttpStatus.BAD_REQUEST,"error",studentRepository.findById(studentId));
    		return response;
    	}
    }
	
	public Response updateStudent(StudentEntity studentEntity) {
    	try {
    		Response response = new Response(HttpStatus.OK,"UPDATED",studentRepository.save(studentEntity));
    		return response;
    	}
    	catch(Exception e) {
    		Response response = new Response(HttpStatus.BAD_REQUEST,"error",studentRepository.save(studentEntity));
    		return response;
    	}
    }
	
	public Response deleteStudentById(int studentId) {
    	try {
    		Response response = new Response(HttpStatus.OK,"DELETED",studentRepository.findById(studentId));
    		studentRepository.deleteById(studentId);
    		return response;
    	}
    	catch(Exception e) {
    		Response response = new Response(HttpStatus.BAD_REQUEST,"error",studentRepository.findById(studentId));
    		return response;
    	}
    }
}
