package net.javaguides.sms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.Repository.StudentRepository;
import net.javaguides.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student updatedStudent) { 
	//	Optional<Student> student = studentRepository.findById(updatedStudent.getId()); 
		
		return studentRepository.save(updatedStudent); 
		 }


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}