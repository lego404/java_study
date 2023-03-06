package sec02.exam01;
import java.util.*;
/*
 * Stack을 이용한 동전 케이스
 */
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {	//동전 케이스가 비었는지 확인
			Coin coin = coinBox.pop();	//돈ㅇ전 케이스에서 제일 위의 동전을 꺼냄
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
	}
}
