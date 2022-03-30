package com.selfpractice.banklab;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    public static long id = 0L;
    private static ReentrantLock lock = new ReentrantLock();

    public static long getNewId() {
        Long result;
        lock.lock(); // Khóa biến id lại chỉ cho duy nhất một thread được truy xuất cập
        // để tránh tình trạng Data Racing !
        try {
            result = ++id; // Tăng rồi gán vào result
        } finally {
            lock.unlock(); // Tăng rồi thi mở lock cho thread khác cùng truy cập
            // Nhiều như mình dùng xong nhà vệ sinh thì đi ra thôi
        }
        return result;
    }

    private IdGenerate() {
    }
}
