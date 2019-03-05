/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WH05_02_19Third;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author User
 */
public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(15);
        for (int i = 0; i < 30; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);

        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("Finish all thread: ");
    }
}
