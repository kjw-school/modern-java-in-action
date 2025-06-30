package chapter4;

/**
 * <h1>외부 반복 vs 내부 반복</h1>
 */
public class Quiz4_1 {

	/**
	 * 어떤 스트림 동작을 사용해 다음 코드를 리팩터링 할 수 있을지 생각해보자.
	 * <pre><code>
	 *     List<String> highCaloricDishes = new ArrayList<>();
	 *     Iterator<String> iterator = menu.iterator();
	 *     while(iterator.hasNext()) {
	 *         Dish dish = iterator.next();
	 *         if(dish.getCalories() > 300) {
	 *         		highCaloricDishes.add(d.getName());
	 *         }
	 *     }
	 * </code></pre>
	 */
	class Question01 {

	}

}
