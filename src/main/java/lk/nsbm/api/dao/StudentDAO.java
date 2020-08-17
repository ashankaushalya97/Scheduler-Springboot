package lk.nsbm.api.dao;

import lk.nsbm.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student,Long> {
}
