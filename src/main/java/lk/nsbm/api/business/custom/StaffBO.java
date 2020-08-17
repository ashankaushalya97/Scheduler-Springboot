package lk.nsbm.api.business.custom;

import lk.nsbm.api.business.SuperBO;
import lk.nsbm.api.dto.StaffDTO;

public interface StaffBO extends SuperBO {

    void saveStaff(StaffDTO staff);
}
