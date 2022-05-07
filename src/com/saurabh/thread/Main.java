package com.saurabh.thread;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

	public static void main(String[] args) {
		
		//newFixedThreadPool method used to create fixed size of thread pool
		//newSingleThreadExecutor method used to create single thread in thread pool
		//newCachedThreadPool used to create threads on demand whenever needed
		ExecutorService executors=Executors.newFixedThreadPool(1);
		
		Thread[] tArray= new Thread[5];
        executors.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread: "+Thread.currentThread().getName());
				System.out.println("Total active threads: "+Thread.activeCount());
				//enumerate method copies active thread and thread group's into given thread group's refrence array
				Thread.enumerate(tArray);
					try {
						Thread.sleep(100);
						Thread.currentThread().interrupt();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("before wait");
				
				for(Thread t: tArray) {
					if(t!=null)
					System.out.println("In loop: "+t.getName());
				}
			}
        	
        });
        executors.execute(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("Thread: "+Thread.currentThread().getName());
				System.out.println("Total active threads: "+Thread.activeCount());
				
					
			}
        	
        });
//        executors.execute(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				System.out.println("Thread: "+Thread.currentThread().getName());
//				System.out.println("Total active threads: "+Thread.activeCount());
//			}
//        	
//        });
//        executors.execute(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				System.out.println("Thread: "+Thread.currentThread().getName());
//				System.out.println("Total active threads: "+Thread.activeCount());
//			}
//        	
//        });
//        executors.execute(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				System.out.println("Thread: "+Thread.currentThread().getName());
//				System.out.println("Total active threads: "+Thread.activeCount());
//			}
//        	
//        });
//        executors.execute(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				System.out.println("Thread: "+Thread.currentThread().getName());
//				System.out.println("Total active threads: "+Thread.activeCount());
//			}
//        	
//        });
//        executors.execute(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				System.out.println("Thread: "+Thread.currentThread().getName());
//				System.out.println("Total active threads: "+Thread.activeCount());
//			}
//        	
//        });
//        executors.execute(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				System.out.println("Thread: "+Thread.currentThread().getName());
//				System.out.println("Total active threads: "+Thread.activeCount());
//			}
//        	
//        });
//        executors.execute(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				System.out.println("Thread: "+Thread.currentThread().getName());
//				System.out.println("Total active threads: "+Thread.activeCount());
//			}
//        	
//        });
	}

}
