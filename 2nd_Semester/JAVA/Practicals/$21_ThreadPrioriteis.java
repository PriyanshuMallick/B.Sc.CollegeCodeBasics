// 21. Write a program to demonstrate priorities among multiple threads.

// import java.lang.Thread;

class T1 extends Thread {
    public void run() {
        System.out.println("Start of thread T1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Output no. " + i + "from thread T1");
        }
        System.out.println("End of thread T1");
    }
}

class T2 extends Thread {
    public void run() {
        System.out.println("Start of thread T2");
        for (int i = 1; i < 11; i++) {
            System.out.println("Output no. " + i + "from thread T2");
        }
        System.out.println("End of thread T2");
    }
}

class T3 extends Thread {
    public void run() {
        System.out.println("Start of thread T3");
        for (int i = 1; i < 11; i++) {
            System.out.println("Output no. " + i + "from thread T3");
        }
        System.out.println("End of thread T3");
    }
}

public class $21_ThreadPrioriteis {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}
