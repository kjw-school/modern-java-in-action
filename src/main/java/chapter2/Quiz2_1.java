package chapter2;

import java.util.List;

// 유연한 prettyPrintApple 메서드 구현하기
public class Quiz2_1 {

	/*
	 * 사과 리스트를 인수로 받아 다양한 방법으로 문자열을 생성(커스터마이즈된 다양한 toString 메서드와 같이) 할 수 있도록 파라미터화된
	 * prettyPrintApple 메서드를 구현하시오. 예를 들어 prettyPrintApple 메서드가 각각의 사과 무게를 출력하도록 지시할 수 있다. 혹은
	 * 각각의 사과가 무거운지 가벼운지 출력하도록 지시할 수 있다. prettyPrintApple 메서드는 지금까지 살펴본 필터링 예제와 비슷한 방법으로
	 * 구현할 수 있다. 독자 여러분이 좀 더 쉽게 문제를 해결할 수 있도록 대략적인 코드를 공개한다.
	 */

	// public static void prettyPrintApple(List<Apple> inventory, ???) {
	//
	// 	for(Apple apple : inventory) {
	// 		String output = ???.???(apple);
	// 		System.out.println(output);
	// 	}
	//
	// }

	public static void prettyPrintApple(List<FilterIngApples.Apple> inventory, AppleFormatter formatter) {

		for(FilterIngApples.Apple apple : inventory) {
			String output = formatter.accept(apple);
			System.out.println(output);
		}

	}

	public interface AppleFormatter {
		String accept(FilterIngApples.Apple apple);
	}

	public class AppleFancyFormatter implements AppleFormatter {

		@Override
		public String accept(FilterIngApples.Apple apple) {

			String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
			return "A + " + characteristic + " " + apple.getColor() + " apple";
		}
	}

	public class AppleSimpleFormatter implements AppleFormatter {

		@Override
		public String accept(FilterIngApples.Apple apple) {
			return "An Apple of " + apple.getWeight() + "g";
		}
	}


}
