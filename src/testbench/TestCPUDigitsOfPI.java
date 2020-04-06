package testbench;

import bench.IBenchmark;
import bench.cpu.CPUDigitsOfPi;
import logging.ConsoleLogger;
import logging.FileLogger;
import logging.ILogger;
import logging.TimeUnit;
import timing.ITimer;
import timing.Timer;

public class TestCPUDigitsOfPI {
    public static void main(String[] args) {
        ITimer timer = new Timer();
        ILogger log = new ConsoleLogger();
        IBenchmark bench = new CPUDigitsOfPi();
        int N = 5000;

        bench.initialize(N);
        bench.warmUp();
        log.write("Starting benchmark", log.writeTime(0, TimeUnit.MILI));

        for(int i = 0 ; i < 1 ; ++i) {
            timer.resume();
            bench.run();
            long time = timer.pause();

            log.write("Run", i, ":", log.writeTime(time, TimeUnit.MILI));
            log.write(CPUDigitsOfPi.PI);
        }

        long total_time = timer.stop();

        log.write("Finished in", log.writeTime(total_time, TimeUnit.MILI));

        log.close();

        bench.clean();
    }
}
