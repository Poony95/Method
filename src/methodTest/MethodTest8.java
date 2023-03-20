package methodTest;
/*
임의의 수 n을 매개변수로 전달받아 1에서 n까지의 
합을 누적하여 반환하는 메소드를 정의하고 
호출 해 봅니다.
*/
public class MethodTest8 {
	
	public static int getSum(int n) {
		int sum =0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int r1 = getSum(5);
		int r2 = getSum(10);
		System.out.println(r1);
		System.out.println(r2);
	}
}
