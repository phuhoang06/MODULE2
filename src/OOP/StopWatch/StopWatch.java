package OOP.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    // Constructor không tham số khởi tạo startTime với thời gian hiện tại
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Getter cho startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter cho endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức start() để reset startTime
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Phương thức stop() để thiết lập endTime
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Phương thức getElapsedTime() để lấy thời gian đã trôi qua
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
