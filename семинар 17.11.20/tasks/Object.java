package tasks;

public class Object {
    int x ;
    synchronized  void get(){
        x =1;
        for(int i = 1; i<5; i++){
            System.out.printf(" %s %d \n", Thread.currentThread().getName());
            x++;
            notifyAll();
            try{
                wait();
                Thread.sleep(200);

            }catch(InterruptedException e){}
        }
    }

    synchronized  void view(){
        System.out.println(x);
    }

}
