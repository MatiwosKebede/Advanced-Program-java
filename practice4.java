/method 1 of using thread in java using runnable interface 

class method1  implements Runnable{
	public void run(){
	 //define the task inside this run method here
	}
	// in  main method
	pubilc static void main(String[] args){
		Thread task = new Thread(new pratice4);
		task.start();
	}


}
// method 2 is using Thread class by extending 
import java.lang.Thread;
class method2 extends Thread{
	public void run(){
		//define the task inside run method here

	}
	public static void main(String[] args){
		method2 task2 = new method();
		task2.start();

	}
// using 2 ways of sleep method in java for thread 
public static void sleep(long miliseconds) throws InterruptedException
//method2 
public void sleep(long miliseconds, int nanos) throws InterruptedException	
// Exectutor is interface used to create and manage java thread pool
import java.util.concurrent.ExecutorService;
// then extends Executor
// declares method to manage life cycle of Executor
// can instantiated using static method called newFixedThread() from 
import java.util.concurrent.Executors;
exectute() return //immediately for each invocation
shutdown() // notify to stop accepting new task but continue executing what aready been submitted


ExecutorService myExecutorSerice = Executor.newFixedThreadPool();
myExecutorService.execute(new Task());
myExecutorService.execute(new Task());

to implement synchronization
synchrnoized( object){
	// statement
} // end of synchrnoization

