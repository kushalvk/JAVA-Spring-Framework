package com.vk.Spring.Data.JPA0;

import com.vk.Spring.Data.JPA0.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query("select s from Student s where s.name = ?1") // "?1" 1 is for first parameter(compulsory in JPA)
    List<Student> findByName(String name);

//    you can without query by it will not work with different name with column
    List<Student> findByMarks(Integer marks);

    List<Student> findByMarksGreaterThan(int marks);
}
