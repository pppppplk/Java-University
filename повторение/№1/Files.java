package com.company;
import java.io.*;

public class Files {
    public static void main(String args[])throws IOException {
        File file = new File("Example.txt");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);

        // Запись содержимого в файл
        writer.write("rrrrrr");
        writer.flush();
        writer.close();

    }

}
