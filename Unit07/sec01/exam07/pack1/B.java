package sec01.exam07.pack1;

public class B {
	public void method() {
		//접근가능
		A a = new A();
		a.field = "value";	
		a.method();
	}
}
