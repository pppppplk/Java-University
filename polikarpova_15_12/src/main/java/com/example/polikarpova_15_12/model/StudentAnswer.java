package com.example.polikarpova_15_12.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_answer")
public class StudentAnswer {

    @Id
    @GeneratedValue(generator = "test_list_generator")

    private Long row_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id", nullable = false)
    private TestList test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_id", nullable = false)
    private Answer answer_id;

    public StudentAnswer(TestList  test) {
        this.test = test;


    }


    public Long getRow_id() {
        return row_id;
    }

    public Answer getAnswer_id() {
        return answer_id;
    }

    public TestList getTest() {
        return test;
    }

    public void setTest(TestList test) {
        this.test = test;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setAnswer_id(Answer answer_id) {
        this.answer_id = answer_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "StudentAnswer{" +
                "row_id=" + row_id +
                ", test=" + test +
                ", user_id=" + user_id +
                ", answer_id=" + answer_id +
                '}';
    }
}
