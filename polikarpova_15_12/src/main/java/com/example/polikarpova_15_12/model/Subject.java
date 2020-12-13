package com.example.polikarpova_15_12.model;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(generator = "test_generator")

    private Long row_id;

    @Column(columnDefinition = "name")
    private String name;

    public Subject(String name) {
        this.name = name;

    }

    public Long getRow_id() {
        return row_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "row_id=" + row_id +
                ", name='" + name + '\'' +
                '}';
    }
}
