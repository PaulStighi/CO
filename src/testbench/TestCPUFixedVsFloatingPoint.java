package testbench;

import bench.IBenchmark;
import bench.cpu.CPUFixedVsFloatingPoint;
import bench.cpu.NumberRepresentation;
import logging.ConsoleLogger;
import logging.ILogger;
import logging.TimeUnit;
import timing.ITimer;
import timing.Timer;

public class TestCPUFixedVsFloatingPoint {
    public static void main(String[] args) {
        ITimer timer = new Timer();
        ILogger log = /* new FileLogger("bench.log"); */new ConsoleLogger();
        TimeUnit timeUnit = TimeUnit.MILI;

        IBenchmark bench = new CPUFixedVsFloatingPoint();
        bench.initialize(10000000);
        bench.warmUp();

        timer.start();
//        bench.run(NumberRepresentation.FIXED);
		bench.run(NumberRepresentation.FLOATING);
        long time = timer.stop();
        log.write("Finished in", log.writeTime(time, timeUnit));
        log.write("Result is", bench.getResult());

        bench.clean();
        log.close();
    }
}
