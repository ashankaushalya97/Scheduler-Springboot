package lk.nsbm.api.business.custom.impl;

import lk.nsbm.api.business.custom.StaffBO;
import lk.nsbm.api.dao.StaffDAO;
import lk.nsbm.api.dto.StaffDTO;
import lk.nsbm.api.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class StaffBOImpl implements StaffBO {

    @Autowired
    StaffDAO staffDAO;

    @Override
    public void saveStaff(StaffDTO staff) {
        staffDAO.save(new Staff(staff.getName(),staff.getUsername(),staff.getPassword()));
    }
}
