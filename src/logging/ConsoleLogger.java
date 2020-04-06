package logging;

public class ConsoleLogger implements ILogger {

	/**
	 * Printing the given arguments in the console
	 */
	@Override
	public void write(Object... args) {
		for(int i = 0 ; i < args.length ; ++i) {
			System.out.print(args[i].toString() + " ");
		}
		System.out.print("\n");
	}

	@Override
	public void writeTime(long value, TimeUnit timeUnit) {
		System.out.println(value / timeUnit.value + " " + timeUnit.key);
	}

	@Override
	public void close() { }
}
