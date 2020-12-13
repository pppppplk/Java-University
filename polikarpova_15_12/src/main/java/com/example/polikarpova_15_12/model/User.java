package com.example.polikarpova_15_12.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "user_generator")

    private Long row_id;

    public Long getRow_id(){
        return row_id;
    }

    @Column(columnDefinition = "first_name")
    private String first_name;

    @Column(columnDefinition = "last_name")
    private String last_name;

    @Column(columnDefinition = "middle_name")
    private String middle_name;

    @Column(columnDefinition = "password_hash")
    private String password_hash;

    @Column(columnDefinition = "login")
    private String login;


    @JoinColumn(name = "group_id", nullable = false)
    @JoinColumn(name = "role_id", nullable = false)
    private  Role role_id;


    @OneToMany(mappedBy = "test_list", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TestList>  test_list;

    @OneToMany(mappedBy = "student_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentAnswer> student_answer;

    public User(String first_name, String last_name,
                String middle_name, String password_hash, String login ) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.password_hash = password_hash;
        this.login = login;
        this.test_list = new ArrayList<TestList>();
        this.student_answer = new ArrayList<StudentAnswer>();

    }

    public void setRole_id(Role role_id) {
        this.role_id = role_id;
    }

    public Role getRole_id() {
        return role_id;
    }

    public List<TestList> getTest_list() {
        return test_list;
    }

    public String getFirst_name() {
        return first_name;
    }

    public List<StudentAnswer> getStudent_answer() {
        return student_answer;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getLogin() {
        return login;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public void setStudent_answer(List<StudentAnswer> student_answer) {
        this.student_answer = student_answer;
    }

    public void setTest_list(List<TestList> test_list) {
        this.test_list = test_list;
    }

    @Override
    public String toString() {
        return "User{" +
                "row_id=" + row_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", password_hash='" + password_hash + '\'' +
                ", login='" + login + '\'' +
                ", test_list=" + test_list +
                ", student_answer=" + student_answer +
                '}';
    }
}
