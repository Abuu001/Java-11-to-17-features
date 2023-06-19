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
}
