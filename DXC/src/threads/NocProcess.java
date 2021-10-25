package threads;

public class NocProcess {
	
	public static void main(String[] args) {
		//oldSequentialWay();
		
		
		FeeThread feeThread = new FeeThread();
		feeThread.start();
		OfficeBoy nagu = new OfficeBoy("sweety-the office boy");
		nagu.start();
		
	}

	private static void oldSequentialWay() {
		try {
			//fee
			Thread.sleep(500);
			System.out.println("got the fee no due stamps");
			//hostel
			Thread.sleep(500);;
			System.out.println("got the fee no due stamps");
			//transport
			Thread.sleep(500);
			System.out.println("got the fee no due stamps");
			//library
			Thread.sleep(500);
			System.out.println("got the fee no due stamps");
		}
		catch (Exception e) {
			
		}
	}

}
