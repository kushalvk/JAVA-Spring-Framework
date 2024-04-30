package com.vk.Spring.Data.JPA0;

import com.vk.Spring.Data.JPA0.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpa10Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpa10Application.class, args);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		s1.setRollno(101);
//		s1.setName("kushal");
//		s1.setMarks(75);
//
//		s2.setRollno(102);
//		s2.setName("om");
//		s2.setMarks(80);
//
//		s3.setRollno(103);
//		s3.setName("harshad");
//		s3.setMarks(70);
//
//		repo.save(s2);
//		repo.save(s3);

		// by default
//		System.out.println(repo.findAll()); // for print all the record in the table
//		System.out.println(repo.findById(102)); // for print all the record by ID

		// created in StuentRepo interface
//		System.out.println(repo.findByName("kushal")); // for print all the record by ID
//		System.out.println(repo.findByMarks(80));
//		System.out.println(repo.findByMarksGreaterThan(72));

		// Update
//		s3.setRollno(103);
//		s3.setName("harshad");
//		s3.setMarks(65);
//		repo.save(s3);

		// delete
		s3.setRollno(103);
		s3.setName("harshad");
		s3.setMarks(65);
		repo.delete(s3);
	}

}
