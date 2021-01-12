public class StopWatch {
    long startTime,endTime;
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void stopWatch(long starTime,long endTime){
        this.startTime = starTime;
        this.endTime = endTime;
    }
    public void startTime(){
        System.out.println(java.time.LocalTime.now());
    }
    public long start(){
        return System.currentTimeMillis();
    }
    public long stop(){
        return System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.stop()-this.start();
    }
        }
class run {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long startTime = stopWatch.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long stopTime = stopWatch.stop();
        long time = stopTime - startTime;
        System.out.println(time);
    }
}

