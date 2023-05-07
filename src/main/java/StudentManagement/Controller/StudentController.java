package StudentManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import StudentManagement.Entity.StudentEntity;
import StudentManagement.Response.Response;
import StudentManagement.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/Student")
    public Response saveStudent(@RequestBody StudentEntity studentEntity){
        return studentService.saveStudent(studentEntity);
    }
    
    @GetMapping("/Student")
    public Response getStudent(){
        return studentService.getStudent();
    }
    
    @GetMapping("/Student/{studentId}")
    public Response getStudentById(@PathVariable("studentId") int studentId){
        return studentService.getStudentById(studentId);
    } 
    
    @PutMapping("/Student/{studentId}")
    public Response updateStudent(@RequestBody StudentEntity studentEntity){
        return studentService.updateStudent(studentEntity);
    }
    
    @DeleteMapping("/Student/{studentId}")
    public Response deleteStudentById(@PathVariable("studentId") int studentId){
        return studentService.deleteStudentById(studentId);
    } 
    
}
