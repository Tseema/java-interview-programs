package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;


@Component
public class TaskExecutor {

    @Value("${thread.count:10}")
    private int threadcount;

    @Value("worker.thread.name")
    private  String threadNameTemplate;

    private AtomicInteger count = new AtomicInteger();

    private ExecutorService eservice ;

    @PostConstruct
    public void init(){
        ThreadFactory threadFactory = (runnable) -> new Thread(threadNameTemplate + count.incrementAndGet());
        eservice = Executors.newFixedThreadPool(threadcount,threadFactory);
    }

}
