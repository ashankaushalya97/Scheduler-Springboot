package lk.nsbm.api.dao;

import lk.nsbm.api.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface EntryDAO extends JpaRepository<Entry,Long> {

    @Query(value = "SELECT * FROM Entry WHERE date LIKE %?#{[0]}%",nativeQuery = true)
    List<Entry> searchEntries(int date);
}
