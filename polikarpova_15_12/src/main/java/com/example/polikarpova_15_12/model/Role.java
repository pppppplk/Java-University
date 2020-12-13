package com.example.polikarpova_15_12.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(generator = "test_generator")
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> users;

    private Long row_id;

    public Role(String name) {
        this.name = name;
        this.users = new ArrayList<User>();

    }


    @Column(columnDefinition = "name")
    private String name;

    public Long getRow_id() {
        return row_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "users=" + users +
                ", row_id=" + row_id +
                ", name='" + name + '\'' +
                '}';
    }
}
