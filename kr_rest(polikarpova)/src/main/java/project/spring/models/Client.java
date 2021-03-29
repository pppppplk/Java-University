package project.spring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;


@Entity
@Table(name = "clients")
public class Client{

    // создала уникальный идентификатор
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private Task task;





    private String firstname, lastname, login,  patronymic, birthday, datatostart, dateofupdate ;



    public Client(String firstname, String lastname, String login,
                  String patronymic, String birthday, String datatostart, String dateofupdate ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.login = login;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.datatostart = datatostart;
        this.dateofupdate = dateofupdate;
    }



    public Client(){}


    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", task=" + task +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", datatostart='" + datatostart + '\'' +
                ", dateofupdate='" + dateofupdate + '\'' +
                '}';
    }
}
