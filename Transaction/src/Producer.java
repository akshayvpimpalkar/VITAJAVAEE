
public class Producer implements Runnable {

	Monitor m;
	int k = 0;
	/**
	 * @param m
	 */
	public Producer(Monitor m) {
//		super();
		this.m = m;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			m.set(k++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
