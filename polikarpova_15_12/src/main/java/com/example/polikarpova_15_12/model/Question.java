package com.example.polikarpova_15_12.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(generator = "question_generator")

    private Long row_id;
    private boolean active;

    @Column(columnDefinition = "text")
    private String text;

    @Column(columnDefinition = "score")
    private int score;

    @OneToMany(mappedBy = "answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Answer> answer;

    public Question(String text, boolean active, int score) {

        this.text = text;
        this.active = active;
        this.score = score;
        this.answer = new ArrayList<Answer>();
    }


    public Long getRow_id(){
        return row_id;
    }

    public void setScore(int score){
        this.score = score;

    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setText(String text){
        this.text = text;
    }

    public int getScore(){
        return score;
    }

    public String getText(){
        return text;
    }

    public boolean getActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    @Override
    public String toString() {
        return "Question{" +
                "row_id=" + row_id +
                ", active=" + active +
                ", text='" + text + '\'' +
                ", score=" + score +
                ", answer=" + answer +
                '}';
    }
}
