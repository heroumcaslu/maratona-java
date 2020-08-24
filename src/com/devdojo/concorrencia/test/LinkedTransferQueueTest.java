package com.devdojo.concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

import javax.sound.midi.Soundbank;

public class LinkedTransferQueueTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TransferQueue<String> tq = new LinkedTransferQueue<String>();
		System.out.println(tq.add("William"));
		tq.put("William");
		System.out.println(tq.offer("William"));
		tq.offer("William", 10, TimeUnit.SECONDS);
		//tq.transfer("William");
		tq.tryTransfer("William");
		tq.tryTransfer("William", 10, TimeUnit.SECONDS);
		
		System.out.println(tq.remainingCapacity());
		
		System.out.println(tq.element());
		System.out.println(tq.peek());
		System.out.println(tq.poll());
		System.out.println(tq.poll(10, TimeUnit.SECONDS));
		System.out.println(tq.remove());
		System.out.println(tq.take());
		
	}

}
