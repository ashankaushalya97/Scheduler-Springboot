package lk.nsbm.api.business.custom;

import lk.nsbm.api.business.SuperBO;
import lk.nsbm.api.dto.EntryDTO;

import java.sql.Date;
import java.util.List;

public interface EntryBO extends SuperBO {

    void saveEntry(EntryDTO entry);

    void updateEntry(EntryDTO entry);

    void deleteEntry(Long id);

    List<EntryDTO> getAllEntries();

    List<EntryDTO> searchEntry(int date);
}
