package logging;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements ILogger{

	/**
	 * Printing the given arguments in a file
	 */
	@Override
	public void write(Object... args) {
		try {
			FileWriter fout = new FileWriter("output.txt");
			
			for(int i = 0 ; i < args.length ; ++i) {
				fout.write(args[i] + " ");
			}
			
			fout.close();
			
			System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
