package devoir2.threads;

import java.util.Random;

/**
 * Created by Darius on 2/28/2017.
 */
public class MyThread extends Thread {
    private String ID;
    private int totalSteps;

    public MyThread(String ID, int totalSteps) {
        this.ID = ID;
        this.totalSteps = totalSteps;
        start();
    }

    public void run() {
        try {

            for(int i = 0; i <= totalSteps; i++){
                if (i != totalSteps) {
                    System.out.println("Thread with ID " + ID + " is at step " + i + " out of " + totalSteps);
                } else {
                    System.out.println("Thread with ID " + ID + " has stopped executing");
                }
                sleep(randomizer());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private long randomizer() {
        Random generator = new Random();
        return generator.nextInt(1000) + 10;
    }
}
