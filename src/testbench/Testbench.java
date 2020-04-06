package testbench;

import logging.*;
import timing.*;
import bench.*;

public class Testbench {
	/**
	 * A Timer, a logger and a benchmark are instantiated 
	 * 
	 * Some initialization is done
	 * 
	 * The benchmark runs between the start and stop timer commands
	 * 
	 * The logger prints the result given by the timer
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ITimer timer = new Timer();
		ILogger log = new ConsoleLogger();
		// ILogger log = new FileLogger();
		// IBenchmark benchmark = new DummyBenchmark();
		IBenchmark benchmark = new DemoBenchmark();

		for(int i = 0 ; i < 3 ; ++i) {
			benchmark.initialize(10000);

			timer.start();
			benchmark.run();
			log.write("Finished in", timer.stop(), "ns");

			benchmark.clean();
		}

		log.close();
	}
}
