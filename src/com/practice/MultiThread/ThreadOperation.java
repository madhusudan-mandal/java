package com.practice.MultiThread;


// main is also a thread in java
public class ThreadOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started..");
		Thread thread = Thread.currentThread(); //Returns a reference to the currently executing thread object
		String s =thread.getName();
		System.out.println("Current thread: " + s);
		thread.setName("myThread");
		System.out.println("Thread name changed to: " + thread.getName());
		try{
			thread.sleep(2000);
			}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		Long threadId = thread.getId();
		System.out.println("Thread id given by scheduler: " + threadId);
		System.out.println("Program ended");
	}

}
