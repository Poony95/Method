package methodTest;
//두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의하고 호출 해 봅니다.

public class MethodTest6 {
	
	public static void printMax(int a, int b) {
		int max = a;
		if(max < b) {
			max = b;
		}
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		printMax(3,6);
		printMax(7,9);
		printMax(100,200);
		
	}

}
