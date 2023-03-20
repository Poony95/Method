package methodTest;
//정수형 배열을 매개변수로 전달받아 
// 총합을 누적하여 반환하는 메소드를 정의
public class MethodTest9 {
	
	public static int getSum(int []a) {
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int []data = {10,20,30,40,50};
		int r1 = getSum(data);
		System.out.println(r1);
		System.out.println(getSum(data));
	}
}
