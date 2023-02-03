package sec06.exam04.package1;
/*
 * 생성자의 접근 제한(2)
 * B.java
 */
public class B {
	//필드
	A a1 = new A(true);	//(O)
	A a2 = new A(1);	//(O)
	//A a3 = new A("문자열");	//(X) -> private 생성자 접근 불가 (컴파일 에러)
}
