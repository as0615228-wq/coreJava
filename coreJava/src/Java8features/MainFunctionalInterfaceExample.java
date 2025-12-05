package Java8features;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainFunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculator add=(a,b) -> a + b;
			System.out.println("Addition: "+add.calculate(25, 21));
			
			
		//Test(T t): boolean value according to condition
			Predicate<Integer> isPositive = n -> n >= 0;
			System.out.println(isPositive.test(10));
			
			//apply (T t): R value after applying some function
			Function<String,Integer> stringLength = S -> S.length();
			System.out.println(stringLength.apply("Hello"));
			
			Function<String ,String> String = S -> S.replace("Software", "k");
			System.out.println(String.apply("Software Developer"));
			
			//Accept(T t): performs some operation on the given argument
			Consumer<String> greeter = name -> System.out.println("Hello "+name);
			greeter.accept("Aditya");
			
			Consumer<Integer> greeter2 = name -> System.out.println(700 * name );
			greeter2.accept(9);
			
			//Get(): Return a value without any point
			Supplier<Double> randomValue =() -> Math.random();
			System.out.println(randomValue.get());
			
			//Apply (T t): return a value after applying some operation on the input
			UnaryOperator<Integer> square = n -> n%n;
			System.out.println(square.apply(4));
			
			//Apply (T t) : return a value after applying some operation on two inputs
			BinaryOperator<Integer> ad =(a,b) -> a | b;
			System.out.println(ad.apply(14, 5));
			
	}

}
