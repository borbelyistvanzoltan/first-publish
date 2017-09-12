package sandbox;

class MasikSzal extends Thread {
	public void run() {
		while (true) {
			System.out.println("Masik szal");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

		}
	}
}

class HarmadikSzal extends Thread {
	public void run() {
		while (true) {
			System.out.println("Egy harmadik szal");

			try {
				Thread.sleep(2500);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

		}
	}
}

class Threads {

	public static void run() {
		while (true) {
			System.out.println("Foszal");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}

	public static void main(String args[]) {

		new MasikSzal().start();
		new HarmadikSzal().start();
		run();

	}
}

