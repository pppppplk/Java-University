package philosophers;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);
        for (int i =1 ; i<=5; i++){
            new Actions(semaphore, i).start();
        }
    }
}
