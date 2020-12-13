package com.example.polikarpova_15_12.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test_list")
public class TestList {

    @Id
    @GeneratedValue(generator = "test_list_generator")

    private Long row_id;

    @Column(columnDefinition = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id", nullable = false)
    private List<User> teacher_id;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Schedule> schedules;



    @OneToMany(mappedBy = "student_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentAnswer> student_answer;

    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Test> test;



    public TestList(String name) {
        this.name = name;
        this.teacher_id = new ArrayList<User>();
        this.schedules = new ArrayList<Schedule>();
        this.student_answer = new ArrayList<StudentAnswer>();
        this.test = new ArrayList<Test>();



    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<StudentAnswer> getStudent_answer() {
        return student_answer;
    }

    public String getName() {
        return name;
    }

    public Long getRow_id() {
        return row_id;
    }

    public Subject getSubject_id() {
        return subject_id;
    }

    public List<User> getTeacher_id() {
        return teacher_id;
    }

    public List<Test> getTest() {
        return test;
    }

    public void setStudent_answer(List<StudentAnswer> student_answer) {
        this.student_answer = student_answer;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject_id(Subject subject_id) {
        this.subject_id = subject_id;
    }

    public void setTeacher_id(List<User> teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setTest(List<Test> test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "TestList{" +
                "row_id=" + row_id +
                ", name='" + name + '\'' +
                ", subject_id=" + subject_id +
                ", teacher_id=" + teacher_id +
                ", schedules=" + schedules +
                ", student_answer=" + student_answer +
                ", test=" + test +
                '}';
    }
}
