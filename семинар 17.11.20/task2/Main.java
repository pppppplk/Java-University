package task2;

public class Main {

    public static void main(String arg[]){
        Object obj = new Object();
        new Thread1(obj).start();
        new Thread1(obj).start();
        obj.notify();
    }
}
