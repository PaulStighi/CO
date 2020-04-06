package logging;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements ILogger {
	private FileWriter fout;

	public FileLogger() {
		try {
			fout = new FileWriter("output.txt");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	/**
	 * Printing the given arguments in a file
	 */
	@Override
	public void write(Object... args) {
		try {
			for(int i = 0 ; i < args.length ; ++i) {
				fout.write(args[i] + " ");
			}
			fout.write("\n");
			System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
		}
	}

	@Override
	public void writeTime(long value, TimeUnit timeUnit) {
		try {
			fout.write(value / timeUnit.value + " " + timeUnit.key);
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		try {
			fout.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
