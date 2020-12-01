package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer  extends  AuditModel{

    @Id
    @GeneratedValue(generator = "answers_generator")
    @SequenceGenerator(
            name = "answers_generator",
            sequenceName = "Answers_sequence",
            initialValue = 1000
    )

    private  Long id;

    public Long getId(){
        return id;
    }

    @Column(columnDefinition = "text")
    private String text;

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore

    private Question question;

    public Question getQuestion(){
        return question;
    }
    public void setQuestion(Question question){
        this.question = question;
    }


    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", test=' " + text +'\'' + "}";
    }
}
