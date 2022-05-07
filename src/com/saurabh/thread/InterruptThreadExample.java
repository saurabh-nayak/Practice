package com.saurabh.thread;
import java.util.ArrayList;
import java.util.List;

public class InterruptThreadExample extends Thread{

	public static volatile List<Integer> list= new ArrayList(); 
	
	@Override
	public void run()
	{
		try {
//			sleep method may throw checked exception Interrupted exception
			Thread.currentThread().sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int i=1;
		while(i!=100)
		{list.add(i);i++;}
	}
	static void newTh()
	{
		Runnable r1= new Runnable() {
			
			@Override
			public void run() {
				for(Integer i : list) {
					System.out.println("Th2: "+i);
				}
			}
		};
		Thread th2= new Thread(r1);
		th2.start();
	}
	public static void main(String[] args) {
                 Thread th1 = new Thread(new InterruptThreadExample());
                 /*InterruptedException will be thrown when interrupt method called on thread  when
                  * thread is in sleep state or wait state
                  * */
                 th1.start();
               th1.interrupt();
                 
                 InterruptThreadExample.newTh();
	}

}
