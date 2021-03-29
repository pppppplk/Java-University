package project.spring.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String name,  datatostart, dateofupdate;

    public Category(String name, String datatostart, String dateofupdate){
        this.name = name;
        this.datatostart = datatostart;
        this.dateofupdate = dateofupdate;
    }

    public Category() {

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

    public String getDatatostart() {
        return datatostart;
    }

    public void setDatatostart(String datatostart) {
        this.datatostart = datatostart;
    }

    public String getDateofupdate() {
        return dateofupdate;
    }

    public void setDateofupdate(String dateofupdate) {
        this.dateofupdate = dateofupdate;
    }
}
