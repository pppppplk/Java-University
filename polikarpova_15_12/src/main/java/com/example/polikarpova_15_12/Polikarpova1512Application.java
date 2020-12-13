package com.example.polikarpova_15_12;


import com.example.polikarpova_15_12.model.*;
import com.example.polikarpova_15_12.server.*;

public class Polikarpova1512Application {

    public static void main(String[] args) {

        AnswerServer answerServer = new AnswerServer();
        Answer answer1 = new Answer("Ответ 1", true);
        AnswerServer.saveAnswer(answer1);

        GroupServer groupServer = new GroupServer();
        Group group1 = new Group("PI19-3", 2019, 1);
        GroupServer.saveGroup(group1);

        QuestionServer questionServer = new QuestionServer();
        Question question1 = new Question("Что это такое?", true, 1);
        QuestionServer.saveQuestion(question1);

        RoleServer roleServer = new RoleServer();
        Role student1 = new Role("Поликарпова Е.И");
        RoleServer.saveRole(student1);

        ScheduleServer scheduleServer = new ScheduleServer();
        Schedule schedule1 = new Schedule(1, "11.10", "10:00",
                "11.10", "11:00", true);
        RoleServer.saveRole(schedule1);


        SubjectServer subjectServer = new SubjectServer();
        Subject subject1 = new Subject("математика");
        SubjectServer.saveSubject(subject1);

        TestListServer testListServer = new TestListServer();
        TestList testList1 = new TestList("контрольная №1");
        TestListServer.saveTestList(testList1);

        UserServer userServer = new UserServer();
        User user1 = new User("Елизавета", "Поликарпова", "Игоревна",
                "43gdcakj`", "pppppplk");



        user1.setRole_id(student1);






    }

}
