import java.lang.Runnable;

public class practice8 {
	static class runTest implements Runnable{
		private String name;
		private int num;
		public runTest(String name, int num){
			this.name = name;
			this.num = num;
		}
		public void run(){
		for(int i = num; i < 10; i++){
			System.out.println(name);
			try{ 
				if(name == "A"){
					Thread.sleep(300);
				}
				else if(name == "B"){
					Thread.sleep(500);
				}
				else if(name == "C"){
					Thread.sleep(700);
				}
				else{
					Thread.sleep(1000);
				}

		} catch(InterruptedException e){
			System.out.println(e);
		}
		}

	}
	}
	public static void main(String[] args){
		runTest A = new runTest("A", 5);
		runTest B = new runTest("B", 5);
		runTest C = new runTest("C", 5);
		Thread job1 = new Thread(A);
		Thread job2 = new Thread(B);
		Thread job3 = new Thread(C);
		job1.start();
		job2.start();
		job3.start();

	}
}
