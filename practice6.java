import java.lang.Thread;
import java.lang.Runnable;

public class practice6{
	public static void main(String[] args){
	//method 1: Separate class
		myRunnable task1 = new myRunnable("task-1");
		Thread t1 = new Thread(task1);
		t1.start();
	}
	
	// method 2: Anonymous class
	Thread t2 = new Thread(new Runnable()
		@Override
		public void run(){
			System.out.println(Thread.currentThread().getName() + ": Ananmous class running");
			}
});
class myRunnable implements Runnable {
	private String name;

	public myRunnable(String name){
		this.name=name;
	}

	@Override 
	public  void run() {
		System.out.println(Thread.currentThread().getName()+ ": " + name + "running");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e){
			System.out.println("Thread interrupted");
		}
	}
}
