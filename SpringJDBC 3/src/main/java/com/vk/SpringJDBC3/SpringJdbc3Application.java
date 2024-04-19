package com.vk.SpringJDBC3;

import com.vk.SpringJDBC3.model.Student;
import com.vk.SpringJDBC3.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbc3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbc3Application.class, args);

		Student s = context.getBean(Student.class);
		s.setRollno(104);
		s.setName("Kushal");
		s.setMarks(21);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudent();
		System.out.println(students);
	}

}
