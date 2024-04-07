package studentassignment.service;

import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;

public interface StudentService {
	
	/***
	 * adds a new student 
	 * @param student the student object is added
	 * @throws DataNotPresentException if data doesn't exists
	 */
	public String addStudent(Student student) throws DataNotPresentException;
	
	/***
	 * gets all the students in the system
	 */
	
	public List<Student> getAllStudents();
	
	/***
	 * 
	 * @param city parameter is used to segregate the students through city
	 * @return It returns the students list according to the specific city
	 */
	
	public 	List<Student> getStudentsByCity(String city) throws StudentNotFoundException;

	
	/***
	 * sorts students by their city
	 * @return returns sorted list
	 */
	public List<Student> sortStudentsByCity();

	
	/***
	 * It sorts the students list through their names
	 * @return It returns the sorted list of students by their name
	 */
	public List<Student> sortStudentsByName();
	
	/***
	 * 
	 * @param id - this is the unique id for the student
	 * @return returns the student object according the unique id
	 * @throws StudentNotFoundException if student doesn't exist with that id
	 */
	public Student displayStudent(Integer id) throws StudentNotFoundException;



}
