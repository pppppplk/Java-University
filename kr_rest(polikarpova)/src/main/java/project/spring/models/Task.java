package project.spring.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonManagedReference
    @OneToOne(mappedBy = "task")
    private Client client;

    @ManyToMany (fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)


    private Set<Category> categories;


    private String name, description, dateofcom, category, datatostart, dateofupdate;
    private boolean performed;

    public Task(String name, String description, String dateofcom, String category, boolean performed,
                String datatostart, String dateofupdate){
        this.name = name;
        this.description = description;
        this.dateofcom = dateofcom;
        this.category = category;
        this.performed = performed;
        this.datatostart = datatostart;
        this.dateofupdate = dateofupdate;
    }

    public Task(){}

    public Client getClient() {
        return client;
    }

    public String getDatatostart() {
        return datatostart;
    }

    public void setDatatostart(String datatostart) {
        this.datatostart = datatostart;
    }

    public void setDateofupdate(String dateofupdate) {
        this.dateofupdate = dateofupdate;
    }

    public String getDateofupdate() {
        return dateofupdate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateofcom() {
        return dateofcom;
    }

    public void setDateofcom(String dateofcom) {
        this.dateofcom = dateofcom;
    }

    public String getCategory() {
        return category;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public boolean isPerformed() {
        return performed;
    }

    public void setPerformed(boolean performed) {
        this.performed = performed;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", client=" + client +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateofcom='" + dateofcom + '\'' +
                ", category='" + category + '\'' +
                ", performed=" + performed +
                '}';
    }
}
