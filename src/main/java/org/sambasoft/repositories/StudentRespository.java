package org.sambasoft.repositories;

import org.sambasoft.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRespository  extends JpaRepository<Student, Long>{

}
