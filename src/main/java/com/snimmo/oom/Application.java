package com.snimmo.oom;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        Runtime rt = Runtime.getRuntime();
        System.out.printf("[0] total: %s free: %s%n", rt.totalMemory(), rt.freeMemory());
        List<byte[]> list = new ArrayList<>();
        int index = 1;
        while (true) {
            byte[] b = new byte[4194304];
            list.add(b);
            rt = Runtime.getRuntime();
            System.out.printf("[%d] total: %s free: %s%n", index++, rt.totalMemory(), rt.freeMemory());
            Thread.sleep(100);
        }
    }

}
