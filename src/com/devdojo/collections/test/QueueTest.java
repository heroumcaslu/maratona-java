package com.devdojo.collections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue =  new PriorityQueue<String>();
		
		queue.add("C");
		queue.add("D");
		queue.add("A");
		queue.add("B");

		System.out.println(queue.offer("alou"));//tenta inserir um elemento em queue com capacidade predefinida
		System.out.println(queue.peek());//devolve o elemento sem remover
		System.out.println(queue.poll());//devolve o elemento e remove o elemento
		System.out.println(queue.remove());
		
	}

}
