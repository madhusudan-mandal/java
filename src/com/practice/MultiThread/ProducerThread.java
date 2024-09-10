package com.practice.MultiThread;

public class ProducerThread extends Thread{
	
	ProducerConsumer pc;
	ProducerThread(ProducerConsumer pc)
	{
		this.pc=pc;
	}

	public void run()
	{
		int i=1;
		while(true)
		{
			this.pc.producer(i);
			i++;
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
