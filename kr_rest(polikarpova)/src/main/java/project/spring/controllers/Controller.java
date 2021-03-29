package project.spring.controllers;

import project.spring.repo.*;
import project.spring.models.*;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("api/clientkr")
public class Controller {

    private final ClientRepo clientRepo;
    private final TaskRepo taskRepo;
    private final CategoryRepo categoryRepo;



    public Controller(ClientRepo clientRepo, TaskRepo taskRepo, CategoryRepo categoryRepo) {
        this.clientRepo = clientRepo;
        this.taskRepo = taskRepo;
        this.categoryRepo = categoryRepo;

    }



    @PostMapping("/clients")
    Client createClient(@RequestParam String firstname, @RequestParam String lastname,
                        @RequestParam String login,  @RequestParam String patronymic) {

        // http://127.0.0.1:8080/api/clientkr/clients?firstname=Elizaveta&lastname=Polikarpova&patronymic=Mihailova&login=sydcuids@gmail.com



        Date d = new Date();
        SimpleDateFormat date;
        SimpleDateFormat dateprem;
        SimpleDateFormat dateend;
        date = new SimpleDateFormat("01.01.2021 12:20");
        dateprem = new SimpleDateFormat("01.01.2021 10:00");
        dateend = new SimpleDateFormat("01.07.2021 20:00");

        date.format(d);
        dateprem.format(d);
        dateend.format(d);
        String birthday = date.format(d);
        String dateofcom = date.format(d);
        String datatostart = dateprem.format(d);
        String dataofupdate = dateend.format(d);

        Category category = new Category("gdcsja", datatostart, dataofupdate);
 
        Task  task = new Task("задание 1", "ifhdojk", dateofcom, "cdiso", true , datatostart,dataofupdate);
        Client client = new Client(firstname, lastname,login,  patronymic, birthday, datatostart, dataofupdate);

        this.taskRepo.save(task);
        this.categoryRepo.save(category);


        task.setClient(client);
        task.setCategories(Set<Category> category);
        client.setTask(task);

        return this.clientRepo.save(client);

    }

    @GetMapping("/tasks/{id}")
    Task getTask(@PathVariable Long id){
        return this.taskRepo.findTasksById(id);
    }



    @GetMapping("/clients/all")
    List<Client> getClient(){
        return this.clientRepo.findAll();
    }


    @DeleteMapping("/clients")
    Client deleteClient(@RequestParam String firstname,@RequestParam String lastname ) {
        List<Client> foundClients = this.clientRepo.findClientByFirstnameAndLastname(firstname, lastname);
        Client foundClient = foundClients.get(foundClients.size()-1);
        this.clientRepo.delete(foundClient);
        return foundClient;
    }

    @PutMapping("/clients/{id}")
    Client updateClient(@RequestBody Client client,   @PathVariable  Long id, @RequestBody String birthday) {
        System.out.println(birthday);
        Client client1 = clientRepo.findClientById(id);
        client1.setLastname(client.getLastname());
        final Client updated = clientRepo.save(client1);
        return updated;
    }




}

