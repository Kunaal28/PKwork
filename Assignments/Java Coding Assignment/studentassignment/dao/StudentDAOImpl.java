package studentassignment.dao;

import java.util.ArrayList;
import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;

public class StudentDAOImpl implements StudentDAO {
    
	private static List<Student> studentList = new ArrayList<Student>();
	
	@Override
	public String addStudent(Student student) {
//		need a collection to store student data
		if(student!=null) {
			studentList.add(student);
			return "Student with student id " + student.getId()	+"added successfully";
		}else {
			throw new DataNotPresentException("Unable to add student as Data not present");
			
		}
	
	}
     
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public List<Student> studentsByCity(String city) {
		
		return studentList;
	}
	
	@Override
	public List<Student> sortStudentsByName() {
		return studentList;
	}

	@Override
	public Student displayStudent(Integer id) throws StudentNotFoundException {
		for(Student student : studentList) {
			if(student.getId() == id) {
				return student;
			}
		}
		throw new StudentNotFoundException("Student with id " + id + " doesn't exists");
	}

	

}
