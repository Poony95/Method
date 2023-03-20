package methodTest;
/*
실수형 배열을 매개변수로 전달받아 
그중에 가장 큰 수를 찾아 반환하는 
메소드를 정의 해 봅니다.
*/
public class MethodTest10 {
	
	public static double getMax(double []n) {
		double max = n[0];
		for(int i=0; i<n.length; i++) {
			if( max < n[i])  
				max = n[i];
		}
		return max;
	}	
	
	public static void main(String[] args) {
		double []m = {3.3,4.5,6.7,10.5};
		double r = getMax(m);
		System.out.println(r);
	}
}