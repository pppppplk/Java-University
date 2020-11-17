package tasks;

public class Thread1  implements  Runnable{
    Object obj;
    Thread1(Object obj){
        this.obj = obj;
    }
    @Override
    public void run() {
        for(int i = 1; i<5; i++){
            obj.get();
            obj.view();

        }

    }
}
