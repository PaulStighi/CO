package logging;

public class ConsoleLogger implements ILogger {

	/**
	 * Printing the given arguments in the console
	 */
	@Override
	public void write(Object... args) {
		for(int i = 0 ; i < args.length ; ++i) {
			System.out.print(args[i] + " ");
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
