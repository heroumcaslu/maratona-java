package com.devdojo.lambdas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forEach(Arrays.asList("William", "Devdojo", "Alou"), (String s) -> System.out.println(s));
		
		List<Integer> list = map(Arrays.asList("William", "Devdojo", "Alou"), (String s) -> s.length());
		System.out.println(list);

	}
	
	public static <T> void forEach(List<T> list, Consumer<T> c) {
		
		for(T e : list) {
			
			c.accept(e);
			
		}
		
	}
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> f){
		
		List<R> result = new ArrayList<R>();
		for(T e: list) {
			
			result.add(f.apply(e));
			
		}
		return result;
		
	}

}
