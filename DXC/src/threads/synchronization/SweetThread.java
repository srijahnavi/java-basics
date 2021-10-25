package threads.synchronization;

public class SweetThread extends Thread {
	Table mTable;
	
	public SweetThread(Table table) {
		mTable = table;
	}
	
	@Override 
	public void run() {
		//TODO Auto-generated method stub
		super.run();
		mTable.printTable(10);
	}

}
