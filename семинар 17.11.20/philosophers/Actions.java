package philosophers;

import java.util.concurrent.Semaphore;

public class Actions extends Thread {
    Semaphore semaphore;
    int num, eat;
    Actions(Semaphore semaphore, int num){
        this.semaphore = semaphore;
        this.num = num;
    }

    public void run(){
        try{
            while (eat <=2){
                semaphore.acquire();//разрешение на выполнение
                System.out.println("Философ " + num + ": берет вилки и кушает");
                Thread.sleep(50);
                eat++;
                System.out.println("Философ " + num + ": заканчивает кушать, оставляет вилки");
                semaphore.release(); //освобождение решения, написанного ранее
                Thread.sleep(50);
            }

        }catch (InterruptedException e){}
    }

}
