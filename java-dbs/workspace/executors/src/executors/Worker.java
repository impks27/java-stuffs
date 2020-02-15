package executors;

public class Worker implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+" : Task "+i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
