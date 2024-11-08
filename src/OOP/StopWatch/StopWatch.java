package OOP.StopWatch;
public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        startTime = 0;
        endTime = 0;
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}



