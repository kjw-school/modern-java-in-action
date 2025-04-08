package chapter3;

public class Quiz3_3 {

	/**
	 * <h5>퀴즈3-3 어디에 람다를 사용할 수 있는가?</h5><br>
	 * <pre><code>
	 * 	    1. execute(() -> {});
	 * 	    public void execute(Runnable r) {
	 * 	        r.run();
	 * 	    }
	 *
	 * 	    2. public Callable<String> fetch() {
	 * 	        return () -> "Tricky example ;-)";
	 * 	    }
	 *
	 * 	    3. Predicate<Apple> p = (Apple a) -> a.getWeight();
	 * </code></pre>
	 * <br>
	 * 1번과 2번은 유효한 람다 표현식이다.<br>
	 * 첫 번째 예제에서 람다 표현식 () -> {}의 시그니처는 () -> void이며 Runnable의 추상 메서드 run의 시그니처와 일치하므로 유효한 람다 표현식이다.<br>
	 * 다만 람다의 바디가 비어있으므로 이 코드를 실행하면 아무 일도 일어나지 않는다.<br>
	 * 두 번째 예제도 유효한 람다 표현식이다. fetch 메서드의 반환 형식은 Callable&lt;String&gt;이다.<br>
	 * T를 String으로 대치했을 때 Callable&lt;String&gt; 메서드의 시그니처는 () -> String이 된다. () -> "Tricky example ;-)"는 () -> String 시그니처이므로 문맥상 유효한 람다 표현식이다.<br>
	 * 세 번째 예제에서 람다 표현식 (Apple a) -> a.getWeight()의 시그니처는 (Apple) -> Integer 이므로 Predicat&lt;Apple&gt;(Apple) -> boolean의 test 메서드의 시그니처와 일치하지 않는다. 따라서 유효한 람다 표현식이 아니다.
	 *
	 */
	class Question {}

}
