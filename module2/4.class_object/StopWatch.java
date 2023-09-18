package classobject;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return 0;
        }
        return endTime - startTime;
    }

    public static void  selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100000);
        }
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thời gian thực thi là: "  + stopWatch.getElapsedTime());
    }
}
