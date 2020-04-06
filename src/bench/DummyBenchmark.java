package bench;

import java.util.ArrayList;
import java.util.Collections;

public class DummyBenchmark implements IBenchmark{
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
	/**
	 * Setting up the array for the benchmark
	 */
	public void initialize(Object...init_params) {
		if(init_params.length == 1) {
			for(int i = (int) init_params[0] ; i > 0 ; i--) {
				arr.add(i);
			}
		}
	}
	
	/**
	 * Running the benchmark, using the given params
	 */
	public void run(Object...run_params) {
		Collections.sort(this.arr);
	}
	
	public void clean() {
		
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
}
