import java.io.IOException;


public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p = Runtime.getRuntime().exec("C:/Documents and Settings/÷»‘–ŒÕŒÃ/workspace/TankWars/local-runner.bat");
		p.waitFor();
		Runner.main(args);

	}

}
