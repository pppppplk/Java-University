package com.example.polikarpova_15_12.model;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test {


    @Id
    @GeneratedValue(generator = "test_generator")

    private Long row_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id", nullable = false)
    private TestList test_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question_id;


    public Long getRow_id() {
        return row_id;
    }

    public Question getQuestion_id() {
        return question_id;
    }

    public TestList getTest_id() {
        return test_id;
    }

    public void setTest_id(TestList test_id) {
        this.test_id = test_id;
    }

    public void setQuestion_id(Question question_id) {
        this.question_id = question_id;
    }

    @Override
    public String toString() {
        return "Test{" +
                "row_id=" + row_id +
                ", test_id=" + test_id +
                ", question_id=" + question_id +
                '}';
    }
}
