package Java8FeaturesPracticeQuestions;

import java.util.function.Function;

public class Stringtwicelength {
	public static void main(String[] args) {
		Function<String,Integer> StringLength= S -> (S.length()*2);
		System.out.println(StringLength.apply("Aditya"));
	}
}