package com.wally.playground.simple_java.thread;

import java.util.List;
import java.util.stream.IntStream;

public class ThreadTest {
    public static void main(String[] args) {
        runNormalThread();
    }

    static void runNormalThread() {
        List<Thread> threads = IntStream.range(0, 1000000)
                .mapToObj(i -> new Thread(() -> {
                }))
                .toList();

        threads.forEach(Thread::start);
    }

    static void runVirtualThread() {
        List<Thread> virtualThreads = IntStream.range(0, 1000000)
                .mapToObj(i -> Thread.ofVirtual().unstarted(() -> {
                }))
                .toList();

        virtualThreads.forEach(Thread::start);
    }
}
