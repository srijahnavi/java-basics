package threads;
public class JoinMethod1  extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
				}
			    System.out.println(i+"--"+Thread.currentThread().getName());
		}
	}
    public static void main(String args[]) {
    	JoinMethod1  t1 = new JoinMethod1();
    	t1.setName("first thread");
    	JoinMethod1  t2  = new JoinMethod1();
    	t2.setName("second thread");
    	JoinMethod1  t3 =  new JoinMethod1();
    	t3.setName("third thread");
    	t1.start();
    	try {
    		t1.join();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	t2.start();
    	t3.start();    	
    }
}
