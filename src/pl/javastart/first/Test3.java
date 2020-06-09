package pl.javastart.first;

public class Test3 implements Runnable {

	Thread thread;
	int value;
	String vS;
	int i = 0;

	public static void main(String[] args) {

	}

	@Override
	public void run() {

		String tName = thread.getName();

		System.out.println("value " + value + " vS " + vS + " name of thread " + tName);
		while(true)
		i++;

	}

	synchronized void setValue(int value, String vS) {

		thread = new Thread(this);
		this.value = value;
		this.vS = vS;
		thread.start();		
	}

}
