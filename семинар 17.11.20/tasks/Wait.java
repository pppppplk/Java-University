package tasks;

public class Wait {
    public static void main(String arg[]) throws InterruptedException {
        Object obj = new Object();
        Thread t = new Thread(){
            @Override
            public void run() {
               System.out.println(getState());
               try{
                   synchronized (obj){
                       obj.notifyAll();
                       obj.wait(200);
                   }
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
            }
        };
        synchronized (obj){
            System.out.println(t.getState());
            t.start();
            obj.wait(200);
            System.out.println(t.getState());
            obj.notifyAll();
            System.out.println(t.getState());
            try{
                t.join();

            }catch (InterruptedException e ){}
            System.out.println(t.getState());


        }

    }
}
