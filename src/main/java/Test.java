import java.io.IOException;


public class Test {

	static String runner_path = "C:/workspace/TankWars/local-runner.bat";
	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p = Runtime.getRuntime().exec(runner_path);
		p.waitFor();
		Runner.main(args);

	}

}
