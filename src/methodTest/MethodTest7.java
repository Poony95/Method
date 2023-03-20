package methodTest;
//두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 
// 반환하는 메소드를 정의
public class MethodTest7 {
	
	public static int getMax(int a, int b) {
		int max = a;
		if(max < b) {
			max = b;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		int r = getMax(3,6);
		System.out.println(r);
		int r1 = getMax(7,9);
		System.out.println(r1);
		System.out.println(getMax(100,200));
		
	}

}
