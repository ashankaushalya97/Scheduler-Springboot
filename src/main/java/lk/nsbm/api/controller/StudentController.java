package lk.nsbm.api.controller;

import lk.nsbm.api.business.custom.StudentBO;
import lk.nsbm.api.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    StudentBO studentBO;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveEntry(@RequestBody StudentDTO student){
        studentBO.saveStudent(student);
        return "\"" +student.getName() + "\"";
    }

}
