package sec01.verify.exam05;

public class Child extends Parent{
	private String name;
		
	public Child() {
		// 2. 생략이 되었지만 여기서 super()를 호출한다.
		// super(); // 기본적으로 호출되기 때문에 생략해도 된다.
		// 6. this("홍길동")을 호출
		this("홍길동");
		// 8. 이후 "Child() call"을 출력
		System.out.println("Child() call");
	}
	public Child(String name) {
		this.name = name;
		// 7. "Child(String name) call"을 출력
		System.out.println("CHild(Stirng name) call");
	}
}
