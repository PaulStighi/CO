package logging;

public interface ILogger {
	void write(Object...args);
	void writeTime(long value, TimeUnit timeUnit);
	void close();
}
