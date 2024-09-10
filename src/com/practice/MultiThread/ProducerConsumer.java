package com.practice.MultiThread;

public class ProducerConsumer {
	int n;
	boolean flag=true;
	// if false Producer will produce the data
	// if true Consumer will consume the data
	synchronized public void producer(int n) // Producer is producing/sets the value of n
	{
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Produced: " + n);
		flag=false;
		notify();
	}
	
	synchronized public int consumer() throws InterruptedException
	{
		if(flag)
		{
			wait();
		}
		System.out.println("Consumed: "+ this.n);
		flag=true;
		notify();
		return this.n;
	}

}
