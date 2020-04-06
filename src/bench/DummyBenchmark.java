package bench;

import java.util.ArrayList;
import java.util.Collections;

public class DummyBenchmark implements IBenchmark {
	private ArrayList<Integer> arr;
	
	public DummyBenchmark() {
		arr = new ArrayList<Integer>();
	}

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

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Running the benchmark, using the given params
	 */
	public void run(Object...run_params) { }

	@Override
	public void warmUp() {

	}

	@Override
	public void run() {
		Collections.sort(arr);

		/*for (int i = 0; i < arr.size(); ++i) {
			for (int j = i + 1; j < arr.size(); ++j) {
				if (arr.get(i) > arr.get(j)) {
					Collections.swap(arr, i, j);
				}
			}
		}*/
	}
	
	public void clean() {
		arr.clear();
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
}
