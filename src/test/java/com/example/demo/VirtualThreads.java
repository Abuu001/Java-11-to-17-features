package com.example.demo;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class VirtualThreads {

    @Test
    void testExample() throws InterruptedException {
        Thread t2 = Thread.ofVirtual()
                .unstarted(()-> System.out.println("started"));

         t2.start();
         t2.join();
    }

    @Test
    void testExample2(){
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            long startTime = System.currentTimeMillis();
            System.out.println("Start Time : " + startTime);
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
            long endTime = System.currentTimeMillis() - startTime;
            System.out.println(" Time Taken : " + endTime);
            System.out.println("Completed ");
        }
    }

    @Test
    void testExample3_platformThreads(){
        Thread.Builder builder = Thread.ofPlatform().name("worker-", 0);
        Thread t1 = builder.start(()-> System.out.println("task1 : " + Thread.currentThread().getName()));   // name "worker-0"
        Thread t2 = builder.start(()-> System.out.println("task2: " + Thread.currentThread().getName()));   // name "worker-1"
        System.out.println("is this a virtual Thread ? : "+ t1.isVirtual());
    }

    @Test
    void testExample3_virtualThreads(){
        Thread.Builder builder = Thread.ofVirtual().name("worker-", 0);
        Thread t1 = builder.start(()-> System.out.println("task1 : " + Thread.currentThread().getName()));   // name "worker-0"
        Thread t2 = builder.start(()-> System.out.println("task2: " + Thread.currentThread().getName()));   // name "worker-1"
        System.out.println("is this a virtual Thread ? : "+ t1.isVirtual());
    }
}
