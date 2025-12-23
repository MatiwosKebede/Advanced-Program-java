import java.lang.Runnable;

public class practice8{
	static class CountingTask implements Runnable{
		private String name;
		public CountingTask(String name){
			this.name=name;
		}
		@Override
		public void run(){
			System.out.println("JobName: "+name);

			for(int i = 0;  i <= 1; i++){
				System.out.println(i);
			}
			try{
				Thread.sleep(1);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		
	      System.out.println(name + "task is finished");
	}
	}
	public static void main(String[] args){
		Runnable task1 = new CountingTask("1st Jobs");
		Runnable task2 = new CountingTask("2nd Jobs");

		Thread firstGuy = new Thread(task1);
		Thread secondGuy = new Thread(task2);

		firstGuy.start();
		secondGuy.start();
	}
}	

