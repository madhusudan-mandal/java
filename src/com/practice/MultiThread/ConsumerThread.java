package com.practice.MultiThread;

public class ConsumerThread extends Thread{
	ProducerConsumer pc;
	ConsumerThread(ProducerConsumer pc)
	{
		this.pc=pc;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				this.pc.consumer();
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
