import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        StopWatch clock1= new StopWatch();
        clock1.start();
        long sum = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j <10000 ; j++) {
                sum+=i;
            }
        }
        clock1.stop();
        System.out.print(clock1.getStartTime());
        System.out.println();
        System.out.print(clock1.getEndTime());
        clock1.getElapsedTime();
        System.out.println();
        System.out.print(clock1.getElapsedTime()+"s");
    }
}