package chapter3;

public class Quiz3_1 {

	/**
	 * <h5>퀴즈 3-1 람다 문법</h5><br>
	 * 람다 규칙에 맞지 않은 람다 표현식을 고르시오.<br>
	 * 1. () -> {}<br>
	 * 2. () -> "Raoul"<br>
	 * 3. () -> { return "Mario"; }<br>
	 * 4. (Integer i) -> return "Alan" + i;<br>
	 * 5. (String s) -> { "Iron Man"; } <br>
	 * 4번과 5번이 유효하지 않는 람다 표현식이다.<br>
	 * 1. 파라미터가 없으며 void를 반환하는 람다 표현식이다. 이는 public void run() {}처럼 바디가 없는 메서드와 같다.<br>
	 * 2. 파라미터가 없으며 문자열을 반환하는 표현식이다.<br>
	 * 3. 파라미터가 없으며(명시적으로 return 문을 이용해서)문자열을 반환하는 표현식이다.<br>
	 * 4. return은 흐름 제어문이다. (Integer i) -> { return "Alan" + i; } 처럼 되어야 올바른 람다표현식이다.<br>
	 * 5. "Iron Man"은 구문(statement)이 아니라 표현식(expression)이다. (String s) -> "Iron Man"처럼 되어야 올바른 람다 표현식이다. 또는 (String s) -> { return "Iron Man"; } 처럼 명시적으로 return 문을 사용해야 한다.
	 */
	class Question {

	}

}
