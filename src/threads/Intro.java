package threads;

import java.util.concurrent.*;

public class Intro {
    static void main() {
    Thread thread1 = new Thread(() -> System.out.println("Thread 1"+Thread.currentThread().getName()))    ;
    thread1.start();

    Runnable runnable = () -> System.out.println("Thread 2"+Thread.currentThread().getName());
    Thread thread2 = new Thread(runnable);
    thread2.start();

        Callable<Integer> callable = () -> 42;
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Callable<String> callable1 = () -> ("Thread 3"+Thread.currentThread().getName());
        Callable<String> callable2 = () -> ("Thread 4"+Thread.currentThread().getName());

       ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> f =executorService.submit(callable1);
        Future<String> submit = executorService.submit(callable2);
        try {
            System.out.println(f.get());
            System.out.println(submit.get());
        } catch (Exception e) {}
        executorService.shutdown();
    }
}
