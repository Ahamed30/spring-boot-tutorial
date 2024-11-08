package com.demo.cruddemo;

import com.demo.cruddemo.dao.StudentDAO;
import com.demo.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);

//			createMultipleStudent(studentDAO);

//			getStudentById(studentDAO, 3);

//			getStudentById(studentDAO, 2);

//			getAllStudents(studentDAO);

			getStudentByLastName(studentDAO);
		};
	}

	private void getStudentByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findStudentsByLastName("Heild");
		for(Student student: students) {
			System.out.println("Student Name: " + student);
		}
	}

	private void getAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for(Student student: students) {
			System.out.println("Student Name: " + student);
		}
	}

	private void getStudentById(StudentDAO studentDAO, Integer studentId) {
		Student student = studentDAO.findStudentById(studentId);
		if(student != null) {
			System.out.println("Student " + student.getId() + "-" + student);
		}
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating new Student...");
		Student student1 = new Student("Dray", "Green", "draygreen23@gsw.com");
		Student student2 = new Student("Buddy", "Heild", "buddyheild@gsw.com");
		Student student3 = new Student("Andrew", "Wiggins", "andrewwiggins22@gsw.com");

		System.out.println("Saving the student");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new Student...");
		Student student = new Student("Stephen", "Curry", "stephcurry30@gsw.com");

		// save the student object
		System.out.println("Saving the student");
		studentDAO.save(student);

		// display id of the saved student
		System.out.println("Saved student. Generated Id: " + student.getId());
	}
}
