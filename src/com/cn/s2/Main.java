package com.cn.s2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        // 创建 4 个线程的线程池
        ExecutorService pool = Executors.newFixedThreadPool(4);

        // 模拟 10 个文件任务
        for (int i = 1; i <= 10; i++) {
            // 文件编号
            int fileId = i;

            // 提交文件处理任务
            pool.submit(() -> {
                // 模拟处理文件
                System.out.println(Thread.currentThread().getName() + " 正在处理文件：" + fileId);
            });
        }
        System.out.println(1);

        System.out.println(20);
        System.out.println(3);
        System.out.println(120);
        // 关闭线程池
        pool.shutdown();
    }
    
}
