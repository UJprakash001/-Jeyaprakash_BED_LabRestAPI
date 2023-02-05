package com.greatlearning.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.sms.enity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
