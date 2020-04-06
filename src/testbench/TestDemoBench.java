package testbench;

import bench.DemoBenchmark;
import bench.IBenchmark;
import logging.ConsoleLogger;
import logging.FileLogger;
import logging.ILogger;
import logging.TimeUnit;
import timing.ITimer;
import timing.Timer;

public class TestDemoBench {
    public static void main(String[] args) {
        ITimer timer = new Timer();
        ILogger log = new ConsoleLogger();
        IBenchmark bench = new DemoBenchmark();
        int N = 100;

        bench.initialize(N);

        for(int i = 0 ; i < 12 ; ++i) {
            timer.resume();
            bench.run();
            long time = timer.pause();

            double offset = ((N * 1000000.0 - time) / (N * 1000000)) * 100;

            log.write("Run", i, ":", log.writeTime(time, TimeUnit.SEC));
            log.write("The offset is", offset, "%");
        }

        long total_time = timer.stop();

        log.write("Finished in", log.writeTime(total_time, TimeUnit.SEC));

        log.close();

        bench.clean();
    }
}
