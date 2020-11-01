package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

abstract class Base {

  abstract String GetName();
  abstract String GetType();
  abstract double average_monthly_salary();


  public static void main(String args[])throws IOException {
    File file = new File("Example.txt");

    HourlyWages HW = new HourlyWages("Лиза Поликарпова ", 250, 1);
    FixedPayment FPayment = new FixedPayment("Максим Лобанов",
            100000, 2);


    // Создание файла
    file.createNewFile();

    // Создание объекта FileWriter
    FileWriter writer = new FileWriter(file);

    // Запись содержимого в файл
    writer.write(HW.GetType() +":" + HW.GetName() + " " + "Зарплата:"+HW.average_monthly_salary() +"\n");
    writer.write(FPayment.GetType() + ":" + FPayment.GetName()+ " " + "Зарплата:" + FPayment.average_monthly_salary());
    writer.flush();
    writer.close();

  }



}

