package studentassignment.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;
import studentassignment.service.StudentService;
import studentassignment.service.StudentServiceImpl;

public class App {

	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.setId(1);
		stud.setName("Jimmy");
		stud.setCity("Paris");
		
		Student stud1 = new Student(2,"andrew","florida");
		Student stud2 = new Student(3,"michael","texas");
		Student stud3 = new Student(4,"johnson","michigan");
		Student stud4 = new Student(5,"joseph","virginia");
		Student stud5 = new Student(6,"jenna","new york");
		Student stud6 = new Student(7,"andrea","alaska");
		Student stud7 = new Student(8,"olivia","california");
		Student stud8 = new Student(9,"Sorauv Ganguly","Kolkata");
		Student stud9 = new Student(10,"Sunil Gavaskar","Mumbai");
		Student stud10 = new Student(11,"Ishant Sharma","New Delhi");
		Student stud11 = new Student(12,"Mohammed Kaif","Muradabad");
		Student stud12 = new Student(13,"Kapil Dev","Chandigarh");
		
//		StudentService studentService = new StudentServiceImpl();
//		System.out.println(studentService.addStudent(stud12));
//		System.out.println(studentService.addStudent(stud11));
//		System.out.println(studentService.addStudent(stud10));
//		System.out.println(studentService.addStudent(stud9));
//		System.out.println(studentService.addStudent(stud8));
//		System.out.println(studentService.addStudent(stud7));
//		System.out.println(studentService.addStudent(stud6));
//		System.out.println(studentService.addStudent(stud5));
//		System.out.println(studentService.addStudent(stud4));
//		System.out.println(studentService.addStudent(stud3));
//		System.out.println(studentService.addStudent(stud2));
//		System.out.println(studentService.addStudent(stud1));
//		System.out.println(studentService.addStudent(stud));
        
//		creating a list and adding all the students to the list
		List<Student> studentList = Arrays.asList(stud,stud1,stud2,stud3,stud4,stud5,stud6,
				                                  stud7,stud8,stud9,stud10,stud11,stud12);
		
//		creating studentService Object
		StudentService studentService = new StudentServiceImpl();

		/***
		 * adds students to the data base and exception will be caught if found
		 */
		for(Student student: studentList) {
			try {
			    
				System.out.println(studentService.addStudent(student));
				
			}
			catch(DataNotPresentException dnpe){
				
				dnpe.getMessage();
		       
			}
		}
		System.out.println();
		
		System.out.println("-----------Students List-------------");
		for(Student student : studentService.getAllStudents()) {
			System.out.println(student);
		}
		
		System.out.println();
		
		System.out.println("------Students list by their city---------------");
		
		System.out.print("Enter city: ");
		Scanner sc = new Scanner(System.in);
		String city = sc.next();

		System.out.println("---------Students from " + city + "----------");
		try {
			for(Student student : studentService.getStudentsByCity(city)) {
				System.out.println(student);
			}
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		
		System.out.println("------Sorted Students list by their Name---------------");
		for(Student student : studentService.sortStudentsByName()) {
			System.out.println(student);
		}
		
		System.out.println();
		
        System.out.println("------Students list by their ID---------------");
		
		System.out.print("Enter id: ");
		Scanner idn = new Scanner(System.in);
		Integer id = idn.nextInt();
		
		try {
			Student student = studentService.displayStudent(id);
			System.out.println(student);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());;
		}
		
		System.out.println();
		
        System.out.println("------Sorted Students list by their City---------------");
        for(Student student : studentService.sortStudentsByCity()) {
			System.out.println(student);
		}
        
        

		
		

		
		
		
	}

} 
