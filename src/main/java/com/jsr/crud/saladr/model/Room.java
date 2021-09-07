package com.jsr.crud.saladr.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;



@Entity
@Table(name = "meetingroom")
public class Room {

    private long id;
    private String name;
    private Date date;
    private Date startHour;
    private  Date endHour;

    public Room(){


    }

    public Room(long id, String name, Date date, Date startHour, Date endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "startHour", nullable = false)
    public Date getStartHour() {
        return startHour;
    }

    public void setStartHour(Date startHour) {
        this.startHour = startHour;
    }

    @Column(name = "endHour", nullable = false)
    public Date getEndHour() {
        return endHour;
    }

    public void setEndHour(Date endHour) {
        this.endHour = endHour;
    }


@Override
public String toString(){
    return "Room [id="+id+",name="+name+",startHour="+startHour+",endHour="+endHour+" ]";
}


}
