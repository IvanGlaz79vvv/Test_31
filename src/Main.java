public class Main {
    public static void main(String[] args) {
        new Thread("Dig1").start();
//        new Thread("Dig2").start();

        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");
    }
}
class JThread extends Thread {
    JThread(String name){
        super(name);
    }
    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}

class Dig1 extends Thread {
    Dig1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Dig1 started");
        for (long a = 0; a < 1_999; a++) {
            long res = a * a - a * a * a;
            if (res == 12) {
//                System.out.println("ОТВЕТ: \na = " + a);
                break;
            }
            System.out.print("Dig1 = " + a);
        }
    }
}

class Dig2 extends Thread {
    Dig2(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Dig2 started");
        for (long a = 2_000; a < 4_000; a++) {
            long res = a * a - a * a * a;
            if (res == 12) {
//                System.out.println("ОТВЕТ: \na = " + a);
                break;
            }
            System.out.print("Dig2 = " + a);
        }
    }
}