package bench;

public interface IBenchmark {
	void initialize();	void initialize(Object...init_params);
	void run();			void run(Object...run_params);
	void clean();
	void cancel();
}