package lk.nsbm.api.controller;

import lk.nsbm.api.business.custom.EntryBO;
import lk.nsbm.api.dto.EntryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/entries")
public class EntryController {

    @Autowired
    EntryBO entryBO;

    @GetMapping
    public ResponseEntity<List<EntryDTO>> getAllEntries(){
        List<EntryDTO> customers = entryBO.getAllEntries();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Count",customers.size()+"");
        System.out.println("GET");
        return new ResponseEntity<>(customers,httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<EntryDTO>> searchEntries(@PathVariable int id){
        List<EntryDTO> customers = entryBO.searchEntry(id);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Count",customers.size()+"");
        System.out.println("GET");
        return new ResponseEntity<>(customers,httpHeaders, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveEntry(@RequestBody EntryDTO entry){
        entryBO.saveEntry(entry);
        return "\"" +entry.getModule() + "\"";
    }

    @PutMapping("/{id}")
    public ResponseEntity updateEntry(@PathVariable Long id, @RequestBody EntryDTO entry){
        if(id.equals(entry.getId())){
            entryBO.updateEntry(entry);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable Long id){
        entryBO.deleteEntry(id);
    }
}
