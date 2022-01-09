package com.saurabh.stream;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

import com.saurabh.string.Product;

public class UtilFunction {

	
	static int count=10;
	static Product cProduct()
	{
		Product p= new Product(101,"saurabh",20);
		return p;
	}
	static String fun() {
		return "Hello Javascript";
	}
	static long lSupplier() {
		return 20l;
	}
	static String function(int a) {
		return "Total number of fruits are "+a;
	}
	static double function(int a, double b) {
		return a+b;
	}
	static void cFunction(String str) {
		System.out.println("consumer output: "+str);
	}
	static void cFunction(String bride, String groom) {
		System.out.println(bride+" and "+groom+" are engaged");
	}
	static void cFunction(int a) {
		count=count+a;
		System.out.println("IntConsumer count: "+count);
	}
	public static void main(String[] args) {
		
		/* 1)Supplier<T> only supply(return) T type value
		 * 2)IntSupplier, DoubleSupplier, LongSupplier, BooleanSupplier etc
		 * */
          Supplier<String> supplier= UtilFunction::fun;
          System.out.println(supplier.get());
          LongSupplier lSupplier = UtilFunction::lSupplier;
          lSupplier.getAsLong();
          
          
          /*
           * 1)Function<T,R> interface which takes T as argument and returns R type
           * 2)IntFunction<R> takes int type as input returns R type 
           *   DoubleFunction<R>, LongFunction<R> etc do the same
           * 3)BiFunction<T,U,R> interface takes 2 type T and U as args as input to method and returns type R
           * 4)ToDoubleFunction<T> accepts T type as arg returns premitive double type
           *   ToIntFunction<T>, ToLongFunction<T> do as per name 
           * 5)ToIntBiFunction<T,U>, ToLongBiFunction<T,U>, ToDoubleBiFunction<T,U> accepts 2 type T, U as arguments
           * and return as per name
           * 6)IntToDoubleFunction int as input double as output
           *   DoubleToLongFunction, LongToDoubleFunction, LongToIntFunction as per name
           * */
          
          Function<Integer, String> function = UtilFunction::function;
          System.out.println(function.apply(10));
          IntFunction<String> function2 = UtilFunction::function;
          System.out.println("IntFunction output: "+function2.apply(10));
          BiFunction<Integer, Double, Double> bFunction = UtilFunction::function;
          System.out.println("Bifunction output: "+bFunction.apply(10, 20d));
          ToDoubleFunction<Integer> tdFunction =(Integer a)->{return (double)a;};
          System.out.println("integer to double conversion of 10 is "+tdFunction.applyAsDouble(10));
          IntToDoubleFunction idFunction= (int a)->{return (double)a;};
          System.out.println(idFunction.applyAsDouble(100));
          	
          /*
           *1) Consumer<T> only consumes T type returns nothing
           *2) BiConsumer<T,U> consumes T and U type returns nothing
           *3) IntConsumer consumes single int value
           *   DoubleConsumer, LongConsumer
           *4) ObjIntConsumer<T> accepts type T and int but returns nothing.
           *   ObjDoubleConsumer<T> , ObjLongConsumer<T>
           */
          Consumer<String> consumer = UtilFunction::cFunction;
          consumer.accept("saurabh is great");
          BiConsumer<String, String> bConsumer= UtilFunction::cFunction;
          bConsumer.accept("thalaiva", "amritha");
          IntConsumer iConsumer = UtilFunction::cFunction;
          iConsumer.accept(5);
          ObjIntConsumer<String> oiConsumer= (String str, int a)->{System.out.println(str+a);};
          oiConsumer.accept("Total number of fruits are ", 10);
          
          /*
           * 1)Predicate<T> returns boolean and accept type T
           * 2)BiPredicate<T,U> returns boolean and accept type T and U both
           * 3)IntPredicate, LongPredicate, DoublePredicate takes arguments as name
           * */
          Predicate<Integer> predicate = (Integer a)->{ return a>10;};
          System.out.println("50 is greter than 10 "+predicate.test(50));
          BiPredicate<Integer, Integer> bPredicate =(Integer a, Integer b)->{return (a+b)>30;};
          bPredicate.test(15, 12);
          
          
          /*
           * 1)UnaryOperator<T> accepts and returns same type T 
           * 2)BinaryOperator<T> accepts 2 T types and returns same type T
           * 2)IntUnaryOperator accepts and returns same type primitive int
           *   DoubleUnaryOperator, LongUnaryOperator
           * 3)IntBinaryOperator acccepts 2 type int as input and returns int 
           * DoubleBinaryOperator, LongBinaryOperator
           * */
          UnaryOperator<Product> uOperator= (Product p)->{return cProduct();};
          System.out.println(uOperator.apply(new Product()));
	}

}
