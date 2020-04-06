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
		// ILogger log = new ConsoleLogger();
		ILogger log = new FileLogger();
		IBenchmark benchmark = new DummyBenchmark();
	
		benchmark.initialize(100000);
		
		timer.start();
		benchmark.run();
		long time = timer.stop();
		
		log.write("Finished in", time, "ns");
		
		log.close();
		
		benchmark.clean();
	}
}
