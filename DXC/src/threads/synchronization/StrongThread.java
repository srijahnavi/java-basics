package threads.synchronization;

public class StrongThread extends Thread{
Table mTable;

     public StrongThread(Table table) {
    	 mTable = table;
     }
     
     @Override
     public void run() {
    	 //TODO Auto-generated method stub
    	 super.run();
    	 mTable.printTable(1000);
     }

}
