import java.lang.Thread;
class myThread extends Thread {
	@Override 
	public void run(){
		for(int i=0; i < 5; i++){
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

public class practice5 {
	public static void main(String[] args){
		myThread task1 = new myThread();
		myThread task2 = new myThread();

		task1.start();
		task2.start();
	}
}

