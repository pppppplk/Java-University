package com.example.polikarpova_15_12.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(generator = "answer_generator")

    private Long row_id;



    public Long getRow_id(){
        return row_id;
    }

    @Column(columnDefinition = "text")
    private String text;
    private boolean correct;

    public Answer(String text, boolean correct) {

        this.text = text;
        this.correct = correct;
        this.student_answer = new ArrayList<StudentAnswer>();
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)

    @OneToMany(mappedBy = "student_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentAnswer> student_answer;

    private Question question;

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "row_id=" + row_id +
                ", text='" + text + '\'' +
                ", correct=" + correct +
                ", student_answer=" + student_answer +
                ", question=" + question +
                '}';
    }
}
