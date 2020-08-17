package lk.nsbm.api.controller;

import lk.nsbm.api.business.custom.StaffBO;
import lk.nsbm.api.dto.StaffDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/staff")
public class StaffController {

    @Autowired
    StaffBO staffBO;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveStaff(@RequestBody StaffDTO staff){
        staffBO.saveStaff(staff);
        return "\"" +staff.getName() + "\"";
    }
}
