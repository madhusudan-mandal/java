package com.practice.MultiThread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer pc = new ProducerConsumer();
		ProducerThread pt = new ProducerThread(pc);
		ConsumerThread ct = new ConsumerThread(pc);
		
		pt.start();
		ct.start();
	}

}
