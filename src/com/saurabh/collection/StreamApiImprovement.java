package com.saurabh.collection;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class StreamApiImprovement{
	
public static void main(String[] args){
	
	//new method takeWhile take the elements till the condition continue to satisfy if a single time condition false it wont consider next elements
Stream<String> nullStream=Stream.of("kushal","nikunj","snehal","kirtee");
nullStream.takeWhile(p->p.startsWith("k")).forEach(System.out::println);

//new method dropWhile drop the elements till the condition continue to satisfy if a single time condition false it wont consider next elements
Stream.of("kushal","kirtee","snehal","kirtee").dropWhile(p->p.startsWith("k")).collect(Collectors.toList()).
forEach(p->System.out.print(p));

//nullStream.forEach(System.out::println);
}
}