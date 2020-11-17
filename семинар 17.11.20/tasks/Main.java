package tasks;

public class Main {

    public static void main(String arg[])  {

        Thread thread = new Thread("Поток 1");
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.run();
        System.out.println(thread.getState());

    }


}
