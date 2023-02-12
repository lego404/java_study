package sec01.verify.exam05;

public class Parent {
	public String nation;
	
	public Parent() {
		// 3. super()가 호출되고 Parent()에서는 this("대한민국");을 호출
		this("대한민국");
		// 5. 이후 "Parent() call"을 출력
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		// 4. 결국 여기서 가장 먼저 "Parent(String nation) call"을 출력
		System.out.println("Parent(String nation) call");
	}
}
