package OOP.StopWatch;
public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {}

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Start time is " + System.currentTimeMillis());
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        System.out.println("End time is " + System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }
}



