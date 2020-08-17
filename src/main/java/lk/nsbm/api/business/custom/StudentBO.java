package lk.nsbm.api.business.custom;

import lk.nsbm.api.business.SuperBO;
import lk.nsbm.api.dto.StudentDTO;

public interface StudentBO extends SuperBO {

    void saveStudent(StudentDTO student);
}
