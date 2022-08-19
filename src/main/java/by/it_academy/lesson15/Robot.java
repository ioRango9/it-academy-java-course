package by.it_academy.lesson15;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Robot implements Runnable {
    private final String name;
    private final int delay;
    private final String actions;

    public Robot(String name, int delay, String actions) {
        this.name = name;
        this.delay = delay;
        this.actions = actions;
    }

    @Override
    public void run() {
        int[] position = new int[] {0, 0};
        Pointer pointer = new Pointer();
        for (int i = 0; i < actions.length(); i++) {
            if (actions.charAt(i) == 'F') {
                pointer.apply(position);
            } if (actions.charAt(i) == 'L') {
                pointer = pointer.left();
            } if (actions.charAt(i) == 'R') {
                pointer = pointer.right();
            }
            try {
                TimeUnit.SECONDS.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Name: '" + name + "' coordinates " + Arrays.toString(position));
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Robot("Billy", 2, "FRFLLFRF" ));
        executorService.submit(new Robot("Jemmy", 4, "RFLLFFRF"));
        executorService.submit(new Robot("SpaceX", 1, "LFRRFFLF"));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}
