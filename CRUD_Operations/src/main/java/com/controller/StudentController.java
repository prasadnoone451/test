package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.repo.StudentRepo;
@RestController
public class StudentController {
	@Autowired
	StudentRepo studentRepo;
	
//    @PostMapping("/api/student")
//    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
//        return new ResponseEntity<>(studentRepo.save(student),HttpStatus.CREATED);
//    }
//    public ResponseEntity<Student> getStudents(@RequestBody Student student) {
//    	return new ResponseEntity<Student>(studentRepo.getById(student),HttpStatus.OK);
//
//    }
}
