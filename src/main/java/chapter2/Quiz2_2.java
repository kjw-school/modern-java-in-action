package chapter2;

// 다음 코드를 실행한 결과는 4,5,6,42 중 어느 것일까?
public class Quiz2_2 {

	public final int value = 4;

	public void doIt() {
		int value = 6;
		Runnable r = new Runnable() {
			public final int value = 5;
			public void run() {
				int value = 10;
				System.out.println(this.value);
			}
		};
		r.run();

	}

	public static void main(String[] args) {
		Quiz2_2 quiz = new Quiz2_2();
		quiz.doIt(); // <- 이 행의 출력 결과는?
	}

}
