package com.devdojo.streams.tests;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.mysql.cj.x.protobuf.MysqlxCrud.Limit;

public class StreamTest5GerandoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
		System.out.println();
		IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
		
		Stream<String> stringStream = Stream.of("William", "DevDojo", "Acessem o facebook e curtam");
		
		stringStream.map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
		
		Stream<Object> empty = Stream.empty();
		
		int nums[] = {1,2,3,4,5};
		
		OptionalDouble average = Arrays.stream(nums).average();
		System.out.println(average.getAsDouble());
		
		try(Stream<String> lines = Files.lines(Paths.get("Test.txt"), Charset.defaultCharset())) {
			
			lines.flatMap(line -> Arrays.stream(line.split("\n")))
			.filter(p -> p.contains("File"))
			.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
		
		//fibonacci
		Stream.iterate(new int[]{0,1}, a -> new int[] {a[1], a[0]+a[1]}).limit(5)
			.map(t -> t[0])
			.forEach(System.out::println);
		
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
		
		ThreadLocalRandom t = ThreadLocalRandom.current();
		Stream.generate(() -> t.nextInt(1, 100)).limit(100).forEach(System.out::println);

	}

}
