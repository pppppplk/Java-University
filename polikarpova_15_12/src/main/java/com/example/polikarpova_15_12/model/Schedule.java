package com.example.polikarpova_15_12.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(generator = "shedule_generator")
    private Long row_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id", nullable = false)
    private TestList test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group_id;

    @Column(columnDefinition = "duration")
    private int duration;

    @Column(columnDefinition = "start_dt")
    private String start_dt;

    @Column(columnDefinition = "start_time")
    private String start_time;

    @Column(columnDefinition = "end_dt")
    private String end_dt;

    @Column(columnDefinition = "end_time")
    private String end_time;

    @Column(columnDefinition = "active")
    private boolean active;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Group> group;

    @OneToMany(mappedBy = "test_list", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TestList> test_list;

    public Schedule(int duration, String start_dt, String start_time,
                    String end_dt, String end_time, boolean active ) {

        this.duration = duration;
        this.start_dt = start_dt;
        this.start_time = start_time;
        this.end_dt = end_dt;
        this.end_time = end_time;
        this.active = active;


    }



    public Long getRow_id() {
        return row_id;
    }

    public TestList getTest() {
        return test;
    }

    public int getDuration() {
        return duration;
    }

    public Group getGroup_id() {
        return group_id;
    }

    public String getEnd_dt() {
        return end_dt;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getStart_dt() {
        return start_dt;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setTest(TestList test) {
        this.test = test;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEnd_dt(String end_dt) {
        this.end_dt = end_dt;
    }

    public void setGroup_id(Group group_id) {
        this.group_id = group_id;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setStart_dt(String start_dt) {
        this.start_dt = start_dt;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "row_id=" + row_id +
                ", test=" + test +
                ", group_id=" + group_id +
                ", duration=" + duration +
                ", start_dt='" + start_dt + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_dt='" + end_dt + '\'' +
                ", end_time='" + end_time + '\'' +
                ", active=" + active +
                ", group=" + group +
                ", test_list=" + test_list +
                '}';
    }
}
