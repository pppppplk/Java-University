package com.example.polikarpova_15_12.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "group")
public class Group {


    @Id
    @GeneratedValue(generator = "group_generator")
    private Long row_id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> users;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Schedule> schedules;

    public Group(String name, int year, int semester) {
        this.name = name;
        this.year = year;
        this.semester = semester;
        this.users = new ArrayList<User>();
        this.schedules = new ArrayList<Schedule>();
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Column(columnDefinition = "name")
    private String name;

    @Column(columnDefinition = "year")
    private int year;

    @Column(columnDefinition = "semester")
    private int semester;

    public Long getRow_id() {
        return row_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Group{" +
                "row_id=" + row_id +
                ", users=" + users +
                ", schedules=" + schedules +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", semester=" + semester +
                '}';
    }
}
