package logging;

public interface ILogger {
	void write(Object...args);
	void close();
}
