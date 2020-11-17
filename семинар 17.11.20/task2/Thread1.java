package task2;

public class Thread1  extends Thread{
    private Object obj;

    public Thread1(Object obj){
        this.obj = obj;
    }

    public void run(){
        synchronized (obj){
            try{
                System.out.println(getName());
                obj.notify();
                obj.wait();
            } catch (InterruptedException e){}
            obj.notify();
        }

    }
}
