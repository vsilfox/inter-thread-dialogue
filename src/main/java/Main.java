public class Main {

    final static int NUMBER_OF_THREADS = 4;

    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("thread group");
        Runnable runnable = new SleepingAndSpeakingThread();

        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            new Thread(threadGroup, runnable, "Thread " + (i + 1)).start();
        }
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadGroup.interrupt();
    }
}
