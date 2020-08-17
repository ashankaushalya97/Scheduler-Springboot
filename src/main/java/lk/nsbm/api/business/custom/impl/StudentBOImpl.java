package lk.nsbm.api.business.custom.impl;

import lk.nsbm.api.business.custom.StudentBO;
import lk.nsbm.api.dao.StudentDAO;
import lk.nsbm.api.dto.StudentDTO;
import lk.nsbm.api.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class StudentBOImpl implements StudentBO {

    @Autowired
    StudentDAO studentDAO;

    @Override
    public void saveStudent(StudentDTO student) {
        studentDAO.save(new Student(student.getName(),student.getUsername(),student.getPassword()));
    }
}
