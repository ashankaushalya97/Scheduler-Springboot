package lk.nsbm.api.dao;

import lk.nsbm.api.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDAO extends JpaRepository<Staff,Long> {
}
