package models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
@Table(name = "news")

public class NewsModel {

    // создала уникальный идентификатор
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public NewsModel() {
    }


    private String firstname, lastname, heading, datestart, dateupdate, text, name;

    public NewsModel(String firstname, String lastname, String heading,
                       String datestart, String dateupdate, String text, String name) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.datestart = datestart;
        this.dateupdate = dateupdate;
        this.text = text;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDatestart() {
        return datestart;
    }

    public void setDatestart(String datestart) {
        this.datestart = datestart;
    }

    public String getDateupdate() {
        return dateupdate;
    }

    public void setDateupdate(String dateupdate) {
        this.dateupdate = dateupdate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "NewsModel{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", heading='" + heading + '\'' +
                ", datestart='" + datestart + '\'' +
                ", dateupdate='" + dateupdate + '\'' +
                ", text='" + text + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}