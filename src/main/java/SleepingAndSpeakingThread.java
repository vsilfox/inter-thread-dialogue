public class SleepingAndSpeakingThread implements Runnable {

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Hi! I am %s \n", Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            System.out.printf("%s was interrupted \n", Thread.currentThread().getName());
        }
    }
}
