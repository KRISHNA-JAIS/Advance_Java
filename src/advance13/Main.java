package advance13;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                int number = random.nextInt(1000);
                System.out.println("Random Integer = "+number);
                if( number % 2 == 0) {
                    Square obj=new Square(number);
                    obj.run();
                }
                else {
                    Cube obj=new Cube(number);
                    obj.run();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

}