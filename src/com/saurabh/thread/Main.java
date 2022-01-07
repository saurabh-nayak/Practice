package com.saurabh.thread;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

	public static void main(String[] args) {
		ExecutorService executors=Executors.newFixedThreadPool(1);
		Thread[] tArray= new Thread[5];
        executors.execute(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("Thread: "+Thread.currentThread().getName());
				System.out.println("Total active threads: "+Thread.activeCount());
				Thread.enumerate(tArray);
					try {
						Thread.sleep(100);
						Thread.currentThread().interrupt();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
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
