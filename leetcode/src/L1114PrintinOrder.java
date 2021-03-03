import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class L1114PrintinOrder {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(() -> {
            try {
                foo.third(() -> System.out.println("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        service.submit(() -> {
            try {
                foo.second(() -> System.out.println("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        service.submit(() -> {
            try {
                foo.first(() -> System.out.println("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        service.shutdown();
    }
}


class Foo {

    volatile int x = 1;
    public Foo() {

    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        while (x != 1)
            wait();

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        x++;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (x != 2)
            wait();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        x++;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (x != 3)
            wait();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();

    }
}