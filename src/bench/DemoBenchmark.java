package bench;

public class DemoBenchmark implements IBenchmark {
    private int n;

    public void initialize(Object...init_params) {
        if(init_params.length == 1) {
            n = (int) init_params[0];
        }
    }

    @Override
    public void initialize() { }

    public void run(Object...run_params) { }

    @Override
    public void run() {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clean() { }

    @Override
    public void cancel() { }
}
