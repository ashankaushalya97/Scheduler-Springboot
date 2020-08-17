package lk.nsbm.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Entry implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    Long id;
    private Date date;
    private String module;
    private String lecturer;
    private String startTime;
    private Float duration;

    public Entry() {
    }

    public Entry(Long id, Date date, String module, String lecturer, String startTime, Float duration) {
        this.id=id;
        this.date = date;
        this.module = module;
        this.lecturer = lecturer;
        this.startTime = startTime;
        this.duration = duration;
    }

    public Entry(Date date, String module, String lecturer, String startTime, Float duration) {
        this.date = date;
        this.module = module;
        this.lecturer = lecturer;
        this.startTime = startTime;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }
}
