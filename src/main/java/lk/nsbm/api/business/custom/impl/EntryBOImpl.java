package lk.nsbm.api.business.custom.impl;

import lk.nsbm.api.business.custom.EntryBO;
import lk.nsbm.api.dao.EntryDAO;
import lk.nsbm.api.dto.EntryDTO;
import lk.nsbm.api.entity.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class EntryBOImpl implements EntryBO {

    @Autowired
    EntryDAO entryDAO;

    @Override
    public void saveEntry(EntryDTO entry) {
        entryDAO.save(new Entry(entry.getDate(),entry.getModule(),entry.getLecturer(),entry.getStartTime(),entry.getDuration()));
    }

    @Override
    public void updateEntry(EntryDTO entry) {
        entryDAO.save(new Entry(entry.getId(),entry.getDate(),entry.getModule(),entry.getLecturer(),entry.getStartTime(),entry.getDuration()));
    }

    @Override
    public void deleteEntry(Long id) {
        entryDAO.deleteById(id);
    }

    @Override
    public List<EntryDTO> getAllEntries() {
        List<Entry> all = entryDAO.findAll();
        List<EntryDTO> entries = new ArrayList<>();
        for (Entry entry : all) {
            entries.add(new EntryDTO(entry.getId(),entry.getDate(),entry.getModule(),entry.getLecturer(),entry.getStartTime(),entry.getDuration()));
        }
        return entries;
    }

    @Override
    public List<EntryDTO> searchEntry(int date) {
        List<Entry> all = entryDAO.searchEntries(date);
        List<EntryDTO> entries = new ArrayList<>();
        for (Entry entry : all) {
            entries.add(new EntryDTO(entry.getId(),entry.getDate(),entry.getModule(),entry.getLecturer(),entry.getStartTime(),entry.getDuration()));
        }
        return entries;
    }
}
