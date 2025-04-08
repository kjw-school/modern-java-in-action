package chapter3;

public class Quiz3_2 {

	/**
	 * <h5>퀴즈3-2 함수형 인터페이수</h5><br>
	 * 다음 인터페이스 중 함수형 인터페이스는 어느 것인가?
	 * <pre><code>
	 *     public interface Adder {
	 *         int add(int a, int b);
	 *     }
	 *
	 *     public interface SmartAdder extends Adder {
	 *         int add(double a, double b);
	 *     }
	 *
	 *     public interface Nothing {}
	 * </code></pre>
	 * <br>
	 * Adder만 함수형 인터페이스다.<br>
	 * SmartAdder는 두 추상 add 메서드(하나는 Adder에서 상속받음)를 포함하므로 함수형 인터페이스가 아니다.<br>
	 * Nothing은 추상 메서드가 없으므로 함수형 인터페이스가 아니다.
	 */
	class Question {

	}

}
