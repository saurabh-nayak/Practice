package com.saurabh.stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.saurabh.string.Product;

public class StreamEx {

	public static void main(String[] args) {
		
		List<Product> productList =  new ArrayList<>();
		productList.add(new Product(101,"laptop",2000));
		productList.add(new Product(102,"xiomee",4000));
		productList.add(new Product(103,"gionee",9000));
		productList.add(new Product(104,"mac",9000));
		productList.add(new Product(105,"asus",1000));
		
		//convert list to map
		//foreach method is default in Iterable interface can use wherever Iterable is implemented
		//cannot use stream() method in map because stream() declared in Collection interface
		Map<Integer, Product> productMap= productList.stream().collect(Collectors.toMap(p->p.pid,p->p));
		productMap.forEach((id,p)->System.out.println("Id: "+id+" name: "+p.getPname()));
		
		//convert list to set
		Set<Integer> productSet = productList.stream().map(p->p.pprice).collect(Collectors.toSet());
		productSet.forEach(p->System.out.println(p));
		
		//count of product whose price greater than 2000
		System.out.println("product price greater than 2000 "+productSet.stream().filter(p->{return p>2000;}).count());
		
		//find maximum and minimum price
		System.out.println("minimum laptop price "+productList.stream().min((p1,p2)->p1.pprice>p2.pprice? 1:-1).get().getPprice());
		System.out.println(productList.stream().min(Comparator.comparing(Product::getPprice)).get().getPprice());
		
		List<Integer> intList =  new ArrayList<>();
		intList.add(10);intList.add(11);intList.add(13);intList.add(15);intList.add(17);intList.add(20);intList.add(25);
		
		//get elements divisble by 5 only
		intList.stream().filter(i->i%5==0).limit(2).collect(Collectors.toSet()).forEach(p->System.out.println(p));
		
	Set<String> setString=	productList.stream().map((p)->{
			if(p.getPname().startsWith("l")) {
				return p.pname;
			}
			return null;
		}).collect(Collectors.toSet());
		System.out.println(setString);
		List<Integer> listInt = new ArrayList();
		for(int i=1;i<10000;i++) {
			listInt.add(i);
		}
		System.out.println();
		long time=System.currentTimeMillis();
		
		/*Parallel Stream create multiple threads which will perform given actions parallelly
		 * Concept is same as multitasking Multiple threads will perform same task
		 * 
		 */
		
		
		/*
		 * listInt.parallelStream().forEach(System.out::println);
		 * System.out.println("Time taken in paralled stream"
		 * +(System.currentTimeMillis()-time)); long bTime=System.currentTimeMillis();
		 * listInt.stream().forEach(System.out::println);
		 * System.out.println("TIme taken normal stream "+(System.currentTimeMillis()-
		 * bTime));
		 */
		 
		/*
		 * allMatch checks for each element satisfy the condition 
		 * if stream is empty return true
		 */
		boolean cond=new ArrayList<Integer>().stream().allMatch(i->{if(i<1000) {
		return true;
		}else return false;
		});
		System.out.println("all elements are less than 10000 "+cond);
		
		/*
		 * anyMatch checks for any element satisfy the condition if stream is empty
		 * return false
		 */
		cond = listInt.stream().anyMatch(i->{if(i==1000) return true;else return false;});
		System.out.println("Any element is 1000 "+cond);

		listInt.stream().findAny().ifPresent(i->System.out.println(i));//print 0
		new ArrayList<Integer>().stream().findFirst().ifPresentOrElse(System.out::println, ()->System.out.println("Empty stream"));//print Empty stream
		
		System.out.println("Stream is parallel "+listInt.parallelStream().isParallel());// true
		
		listInt.stream().limit(10).forEach(System.out::println);// 10 elements will printed
		
		/*
		 * in max, min method need to pass comparator 
		 * */
		System.out.println("Maximum of the stream "+new ArrayList<Integer>().stream().max(Comparator.naturalOrder()));
		System.out.println(listInt.stream().min(Comparator.naturalOrder())); // prints 0 which is minimum element
		
	
		System.out.println("None of the element matches "+listInt.stream().noneMatch(i->{if(i==0)return true;else return false;}));
		System.out.println("Is parallel "+listInt.stream().parallel().isParallel());
		System.out.println("peek method");
		listInt.stream().peek(i->System.out.println(i=i*2)).limit(5).forEach(System.out::println);
		
		//perform operations on each element of the stream in peek method
		System.out.println("Count of peek"+listInt.stream().peek(i->System.out.println(i=i*2)).count());
		
		//returns stream after skipping first n elements
//		listInt.stream().skip(9900).forEach(System.out::println);
		
		listInt.stream().collect(Collectors.toSet()).forEach(i->{if(i<10) System.out.println(i);});
		
		//dropWhile method drops the elements till the condition continue to become true
		System.out.println("After drop complete "+listInt.stream().dropWhile((i)->{if(i==9889)return false;else return true;}).count());
		
		
		System.out.println("divisible by 19 elements "+listInt.stream().filter((i)->{if(i%19==0) return true;else return false;}).count());
		listInt.stream().filter((i)->{if(i%19==0) return true;else return false;}).forEach(System.out::println);
		
		Function<Integer, Double> fun= (i)->{i=i*2;Double d=Double.valueOf(i.toString());return d;};
		listInt.stream().map(fun).limit(5).forEach(System.out::println);
		List<Integer> blankList = new ArrayList();
		System.out.println("flatMap");
		
		/*
		 * flatMap() used when we want to perform some actions on stream and return that stream or new stream 
		 * flatMapToDouble() used to return DoubleStream after performing some action
		 * flatMapToInt() used to return IntStream after performing some action
		 * flatMapToLong() used to return LongStream after performing some action
		 * mapToDouble() used to return DoubleStream and takes ToDoubleFunction as input
		 * mapToInt() used to return IntStream and takes ToIntFunction as input
		 * mapToLong() used to return LongStream and takes ToLongFunction as input
		 * 
		 * In flatMapToDouble method lambda will return a DoubleStream but in mapToDouble lambda should return double type value
		 * thats the difference
		 * */
		listInt.stream().flatMap((i)->{if(i>9989) {blankList.add(i);}return blankList.stream();}).forEach(System.out::println);;
		listInt.stream().flatMapToDouble((i)->{if(i>9989) {blankList.add(i);}return (blankList.stream().mapToDouble(j->Double.parseDouble(j.toString())));}).forEach(System.out::println);
		
		
		/*
		 * mapToDouble() method used to change stream to DoubleStream
		 * mapToInt(), mapToLong etc do the same as per name
		 * 
		 * */
		listInt.stream().mapToDouble(i->{double d= (double)i; return d;}).limit(5).forEach(System.out::println);
		
		/*
		 * reduce() method used to get max, min, average etc operations
		 * method accepts BinaryOperator<T> as input
		 * */
		
		Stream<Integer> streamInt=listInt.stream();
		System.out.println("Highest Element of stream "+streamInt.reduce((i,j)->{
			if(i>j)return i;else return j;
		}));
		Stream<Integer> sInt=listInt.stream();
		int count=listInt.size();
		System.out.println("Average of stream "+sInt.reduce((i,j)->{if(j<9999) {i=i+j;return i;}else {i=i/count;return i;}} ));
		
		/*
		 * Above calculated sum is correct 
		 * int sum=0; for(int i=1;i<10000;i++) { sum=sum+i; }
		 * System.out.println("Average calculated is "+sum/9998);
		 */
		
		/*
		 * If try to access stream elements which already have been used
		 *  java.lang.IllegalStateException: stream has already been operated upon or closed
		 * */
//		System.out.println("Stream count "+streamInt.count());
		//dropWhile, takeWhile, ordered unordered, mapTodouble vs flatMaptodouble diff
		
		/*
		 * dropWhile continue to drop elements till condition continue to be true
		 * takeWhile continue to take elements till condition continue to be true 
		 * once condition false will not check further elements
		 * */
		System.out.println("Count takeWhile "+listInt.stream().dropWhile(i->i<100?true:false).count());
		System.out.println("Total number of elements below 1111 is : "+listInt.stream().dropWhile(i->{
			if(i<1111) {return true;}
		else {
			return false;
		}
			}).count());
		

		Set<Integer> setInt = new LinkedHashSet();
		for(int i=1;i<=100;i++) {setInt.add(i);}
//		setInt.stream().forEach(System.out::println);
		
		/*
		 * forEach is not ordered way of using loop it use whatever comes in pipeline
		 * forEachOrdered is ordered way of using loop follows ordering 
		 *
		 * */
		//will print 1 to 15 numbers
		setInt.stream().unordered().parallel().limit(15).forEachOrdered(System.out::println);
		
		//will print random 15 numbers whatever comes in pipeline as stream is unordered and forEach used
		setInt.stream().unordered().parallel().limit(15).forEach(System.out::println);
		
		System.out.println("Unordered parallel findfirst method");
		setInt.stream().unordered().parallel().findFirst().ifPresent(System.out::println);//print random number
		
		System.out.println("parallel findfirst method");
		setInt.stream().parallel().findFirst().ifPresent(System.out::println);//print first element
		
		System.out.println("sequencial stream findfirst method");
		setInt.stream().findFirst().ifPresent(System.out::println);//print first element
		
		System.out.println("Average "+setInt.stream().collect(Collectors.averagingDouble(i->i)));

		/*
		 * of method of stream throws Nullpointer when element passed is null
		 * ofNullable returns empty stream if null passed as element
		 * */
//		Stream.ofNullable(null).forEach(System.out::println);;
		
		/*
		 * 2 iterate methods 1 is same as for loop accepts 3 arguments 
		 * starting point(Integer), condition(Predicate), and next value(UnaryOperator)
		 * 2nd accepts 2 arguments starting value(Integer) and UnaryOPerator 
		 * */
		Stream.iterate(1, (i)->{i=(i*5);return i;}).limit(5).forEach(System.out::println);
		Stream.iterate(2, i->(i%2==0), i->{return i*5;}).limit(5).forEach(System.out::println);
		
		/*
		 * builder() method returns StreamBuilderImpl object
		 * */
		System.out.println("Stream using builder");
		Stream.builder().add(100).add(200).add(300).build().forEach(System.out::println);
}


}
