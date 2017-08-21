package thread;

/**
 * 
 * This example uses Java 8.
 *
 */

public class CreatingStartingThreads {
	
	public static class HelloThread extends Thread{
		@Override
		public void run() {
			System.out.println("Hello!");
			System.out.println("Hello!");
			System.out.println("Hello!");
			System.out.println("Hello!");

			
		}
	}
	
	public static class WorldThread extends Thread{
		@Override
		public void run() {
			System.out.println("World!");
			System.out.println("World!");
			System.out.println("World!");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException{
		Thread helloThread = new HelloThread();
		Thread worldThread = new WorldThread();
		
		helloThread.start();
		
		Thread.sleep(4000);;
		
		worldThread.start();
		worldThread.stop();

	}
	
	
}
