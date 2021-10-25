package threads.synchronization;

public class ThreadSyncDemo {
	
	public static void main(String[] args) {
		Table table = new Table();
		
		StrongThread strongThread = new StrongThread(table);
		SweetThread sweetThread = new SweetThread(table);
		
		strongThread.start();
		sweetThread.start();
		
	}

}
